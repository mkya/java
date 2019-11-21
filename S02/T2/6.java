//6. На вход метода подаётся строка. Метод должен определить состоит ли строка из чётного числа букв и если это так, то поменять местами её половины и вернуть полученную строку. В решении задачи использовать StringBuilder. Например для строки: “symbol”, результатом будет: “bolsym”.
// chcp 65001

import java.util.Scanner;

class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String();
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите строку");
        a = sc.nextLine();

        if (a.length() % 2 == 0) {
            sb.append(a.substring(a.length() / 2));
            System.out.print(sb.append(a.substring(0, a.length() / 2)));
        }
    }
}