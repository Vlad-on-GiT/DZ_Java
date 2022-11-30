package DZ_3;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class taskThree {

    /*
    Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
    Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
    Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
    Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
    */

    public static void main(String[] args)
    {
        System.out.println("10 тысяч вставок для ArrayList занимает: ");
        System.out.println(getTimeMsOfInsert(new ArrayList()) + " мс");
        System.out.println("10 тысяч вставок для LinkedList занимает: ");
        System.out.println(getTimeMsOfInsert(new LinkedList()) + " мс");
        System.out.println("10 тысяч вызовов get для ArrayList занимает: ");
        System.out.println(getTimeMsOfGet(fill(new ArrayList())) + " мс");
        System.out.println("10 тысяч вызовов get для LinkedList занимает: ");
        System.out.println(getTimeMsOfGet(fill(new LinkedList())) + " мс");
    }
    public static long  getTimeMsOfInsert(List list)
    {
        Date timeBefore = new Date();
        insert10000(list);
        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
    }
    public static void insert10000(List list)
    {
        for (int i=0;i<10000;i++)
        {
            list.add(0, new Object());
        }
    }
    private static List fill(List list)
    {
        for(int i = 0; i < 11; i++)
        {
            list.add(new Object());
        }
        return list;
    }
    public static long  getTimeMsOfGet(List list)
    {
        Date timeBefore = new Date();
        get10000(list);
        //напишите тут ваш код
        Date timeAfter = new Date();
        long msDelay = timeAfter.getTime() - timeBefore.getTime();
        return msDelay;
        //напишите тут ваш код
    }
    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;
        for (int i = 0; i < 10000; i++)
        {
            list.get(x);
        }
    }
}