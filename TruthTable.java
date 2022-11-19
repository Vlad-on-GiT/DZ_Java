public class TruthTable {
    public static void main(String[] args) {

        System.out.println(ConsoleColors.RED + "\t  res = (p & q)" + ConsoleColors.RESET);
        System.out.println(ConsoleColors.GREEN + "   Таблица истинности:" + ConsoleColors.RESET);
        System.out.println("|   " + "p\t|   q\t|  res\t|");
        System.out.println("-------------------------");
        out(false, false);
        out(true, false);
        out(false, true);
        out(true, true);
    }
    public static void out(boolean p, boolean q){
        System.out.println("| " + (p ? "true\t| " : "false\t| ") + (q ? "true\t| " : "false\t| ") + ((p & q) ? "true\t| " : "false\t| "));
    }
}
