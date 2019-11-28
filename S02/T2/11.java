//11. *** На вход подаётся строка и символ. Строка разбивается разделителями (символ) на подстроки. Вывести на экран все подстроки с указанием их длины. Например для строки: JBorn*Course*JaVa , результатом будет:
//        JBorn - 5
//        Course - 6
//        JaVa - 4

import java.util.Scanner;

class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку и символ");
        String a = sc.next();
        String b = sc.next();
        char l = b.charAt(0);
        int k = 0;

        for (int i = 0; i < a.length(); i++) {  //Возможно всю эту канитель можно было реализовать проще, но я придумал только так(
            if (a.charAt(i) == l) {

                if (i == 0) {
                    for (int w = 1; w < a.length(); w++) {
                        if (a.charAt(w) == l && w != a.length()) {
                            System.out.println(a.substring(1, w));
                            w = a.length();
                        }
                    }
                }
                if (k == 0 && i != 0)
                    System.out.println(a.substring(0, i));
                if (i > 0 && k != 0)
                    System.out.println(a.substring(k, i));
                k = i + 1;
            }
            if (i + 1 == a.length())
                System.out.println(a.substring(k, a.length()));
        }
    }
}
