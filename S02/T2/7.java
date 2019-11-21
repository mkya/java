// 7. На вход метода подаётся строка и символ. Метод должен возвести поданный символ в верхний регистр,
// а остальные в нижний и вернуть изменённую строку. Например для строки: “Java” и символа: “a" , результатом будет: ”jAvA”
// chcp 65001

import java.util.Scanner;

class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку и символ");
        String[] a = {sc.next(), sc.next()};
        System.out.println(a[1].toUpperCase());
        System.out.println(Digit(a));
    }

    private static String Digit(String a[]) {
        for (int i = 0; i < 2; i++)
            a[i] = a[i].toLowerCase();
        a[0] = a[0].replace(a[1], a[1].toUpperCase());
        return (a[0]);
    }
}