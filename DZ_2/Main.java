package DZ_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Metods.CharAt();
        System.out.println("_".repeat(30));
        Metods.CompareTo();
        System.out.println("_".repeat(30));
        Metods.CompareToIgnoreCase();
        System.out.println("_".repeat(30));
        Metods.ContentEquals();
        System.out.println("_".repeat(30));
        Metods.CopyValueOf();
        System.out.println("_".repeat(30));
        Metods.EndsWith();
        System.out.println("_".repeat(30));
        Metods.EqualsIgnoreCase();
        System.out.println("_".repeat(30));
        Metods.Intern();
        System.out.println("_".repeat(30));
        Metods.Length();
        System.out.println("_".repeat(30));
        Metods.Substring();
        System.out.println("_".repeat(30));
        Metods.ToCharArray();
        System.out.println("_".repeat(30));
        Metods.Trim();
        System.out.println("_".repeat(30));
        System.out.println("Введите строку для проверки на числа: ");
        Metods.CheckIsOnlyDigit(in.nextLine());
        System.out.println("_".repeat(30));
        System.out.println("Введите строку для склеивания: ");
        String str = in.nextLine();
        System.out.println("Сколько раз склеить? ");
        int count = Integer.parseInt(in.nextLine());
        Metods.ConcatStr(count, str);


    }
}
