package DZ_2;

public class Metods {
    public static void CharAt() {
        String s = "Я делаю домашку!";
        char res1 = s.charAt(5);
        char res2 = s.charAt(10);
        System.out.println("Пятый символ строки - " + res1);
        System.out.println("Десятый символ строки - " + res2);
    }

    public static void CompareTo() {
        String str1 = "I will become a good PROGER!";
        String str2 = "I will become a good PROGER!";
        String str3 = "I'm a good PROGEr!";
        int res = str1.compareTo(str2);
        System.out.println(res);
        res = str2.compareTo(str3);
        System.out.println(res);
        res = str3.compareTo(str1);
        System.out.println(res);
    }

    public static void CompareToIgnoreCase() {
        String str1 = "I will become a good PROGER!";
        String str2 = "I will become a good PROGER!";
        String str3 = "I'm a good PROGER!";
        int res = str1.compareToIgnoreCase(str2);
        System.out.println(res);
        res = str2.compareToIgnoreCase(str3);
        System.out.println(res);
        res = str3.compareToIgnoreCase(str1);
        System.out.println(res);
    }

    public static void ContentEquals() {
        String str1 = "Welcome to HELL!";
        String str2 = "It's very painfully!";
        StringBuffer str3 = new StringBuffer("Welcome to HELL!");
        StringBuffer str4 = new StringBuffer("Welcome to");
        boolean result = str1.contentEquals(str3);
        System.out.println("Строка \"Welcome to HELL!\" равна строке буфера \"Welcome to HELL!\"? \n" + result);
        result = str2.contentEquals(str3);
        System.out.println("Строка \"It's very painfully!\" равна строке буфера \"Welcome to HELL!\"? \n" + result);
        result = str1.contentEquals(str4);
        System.out.println("Строка \"Welcome to HELL!\" равна строке буфера \"Welcome to\"? \n" + result);
    }

    public static void CopyValueOf() {
        char[] Str1 = {'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D'};
        String Str2 = "";
        Str2 = Str2.copyValueOf(Str1);
        System.out.println("Возвращаемая строка: " + Str2);
        Str2 = Str2.copyValueOf(Str1, 2, 6);
        System.out.println("Возвращаемая строка: " + Str2);
    }

    public static void EndsWith() {
        String Str = new String("Welome to HELL!");
        boolean retVal;
        retVal = Str.endsWith("HELL!");
        System.out.println("Возвращаемое значение: " + retVal);
        retVal = Str.endsWith("HE");
        System.out.println("Возвращаемое значение: " + retVal);
    }

    public static void EqualsIgnoreCase() {
        String Str1 = "Welcome to HELL!";
        String Str2 = Str1;
        String Str3 = new String("Very, very painfully!");
        String Str4 = new String("WELCOME TO HELL!");
        boolean retVal;
        retVal = Str1.equalsIgnoreCase(Str2);
        System.out.println("Строка Str1 равна строке Str2? Ответ: " + retVal);
        retVal = Str1.equalsIgnoreCase(Str3);
        System.out.println("Строка Str1 равна строке Str3? Ответ: " + retVal);
        retVal = Str1.equalsIgnoreCase(Str4);
        System.out.println("Строка Str1 равна строке Str4? Ответ: " + retVal);
    }

    public static void Intern() {
        String Str1 = new String("WELCOME TO HELL!");
        String Str2 = new String("Welcome to HELL!");
        System.out.print("Каноническое представление Str1: ");
        System.out.println(Str1.intern());
        System.out.print("Каноническое представление Str2: ");
        System.out.println(Str2.intern());
    }

    public static void Length() {
        String Str1 = new String("Welcome to HELL!");
        String Str2 = new String("HELL");
        System.out.print("Длина строки \"Welcome to HELL!\" - ");
        System.out.println(Str1.length());
        System.out.print("Длина строки \"HELL\" - ");
        System.out.println(Str2.length());
    }

    public static void Substring() {
        String Str = new String("Welcome to HELL!");
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5));
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5, 15));
    }

    public static void ToCharArray() {
        String Str = new String("Welcome to HELL!");
        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toCharArray());
    }

    public static void Trim() {
        String Str = new String("   Welcome to HELL!   ");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.trim());
    }

    public static void CheckIsOnlyDigit (String str) {
        if (str.chars().allMatch(Character::isDigit))
            System.out.println("В строке только цифры.");
        else
            System.out.println("В строке имеются иные символы.");
    }

}
