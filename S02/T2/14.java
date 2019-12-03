//14. *** На вход метода подаётся строка. Строка содержит слова разделённые последовательностями пробелов. Необходимо убрать все лишние пробелы и вернуть изменённую строку.
//        Например для строки
//        “            Future       with java          ”
//        результатом будет: “Future with java”.
// chcp 65001
import java.util.Scanner;

class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = sc.nextLine();
        String[] arg = a.split("[\\s]+");
        for (int i = 0; i < arg.length; i++) {
            if (!arg[i].matches("[.]+"))
            System.out.print(arg[i] + " ");
        }
    }
}