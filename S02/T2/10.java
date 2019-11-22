//10. На вход подаётся строка. Получить её часть, образованную идущими подряд латинскими буквами. Например для строки: “111*12JBorn4344/123” , результатом будет: “JBorn”.
//chcp 65001

import java.util.Scanner;

class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку и символ");
        String b = new String();
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char l = a.charAt(i);
            if (Character.toString(l).matches("[a-z-A-Z]+"))
            System.out.print(l);
        }
    }
}