package DZ_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Drunk {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите карты для первого игрока через пробел или запятую: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] firstHand = reader.readLine().split("\\D+");
        System.out.println("Теперь введите карты для второго игрока через пробел или запятую: ");
        String[] secondHand = reader.readLine().split("\\D+");
        reader.close();

        ArrayList<Integer> arrFirst = new ArrayList<>();
        ArrayList<Integer> arrSecond = new ArrayList<>();
        int count = 0;
        int firstLenght = firstHand.length;
        int secondLenght = secondHand.length;

        for (int i = 0; i < firstLenght; i++) {
            arrFirst.add(Integer.parseInt(firstHand[i]));
        } for (int i = 0; i < secondLenght; i++) {
            arrSecond.add(Integer.parseInt(secondHand[i]));
        }

        while (!arrFirst.isEmpty() && !arrSecond.isEmpty()) {
            if (count == 10000) {
                System.out.println("Botva");
                break;
            }  else if (arrFirst.get(0) == 0 && arrSecond.get(0) == 9) {
                arrFirst.add(arrFirst.get(0));
                arrFirst.add(arrSecond.get(0));
            } else if (arrFirst.get(0) == 9 && arrSecond.get(0) == 0) {
                arrSecond.add(arrFirst.get(0));
                arrSecond.add(arrSecond.get(0));
            } else if (arrFirst.get(0) > arrSecond.get(0)) {
                arrFirst.add(arrFirst.get(0));
                arrFirst.add(arrSecond.get(0));
            } else if (arrFirst.get(0) < arrSecond.get(0)) {
                arrSecond.add(arrFirst.get(0));
                arrSecond.add(arrSecond.get(0));
            }
            arrSecond.remove(0);
            arrFirst.remove(0);
            count++;
        }
        
        if (count < 10000) {
            if (!arrFirst.isEmpty()) {
                System.out.println("First " + count);
            } else {
                System.out.println("Second " + count);
            }
        }
    }
}

