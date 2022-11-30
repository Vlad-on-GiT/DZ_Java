package DZ_3;
import java.util.Scanner;
import java.util.Arrays;
import static DZ_3.Sort.mergeSort;

public class twoOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] twenty = new int[20];

        for(int i = 0; i < twenty.length; i++) {
            System.out.printf("Введите число №%d \n", i + 1);
            twenty[i] = Integer.parseInt(in.nextLine());
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString (twenty));
        mergeSort(twenty);
        int n = twenty.length;
        int[] arrOne = Arrays.copyOfRange(twenty, 0, (n + 1)/2);
        int[] arrTwo = Arrays.copyOfRange(twenty, (n + 1)/2, n);
        System.out.println("Массив с наименьшими числами:");
        System.out.println(Arrays.toString (arrOne));
        System.out.println("Массив с наибольшими числами:");
        System.out.println(Arrays.toString (arrTwo));
    }
}
