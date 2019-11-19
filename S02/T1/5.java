// 5 На вход метода подаются три целых числа. Определить являются ли эти числа тройкой Пифагора.

import java.util.Scanner;

class test5 {
    public static void main(String[] args) {
        System.out.println("Введите число 1");
        int a = requestNumber();
        System.out.println("Введите число 2");
        int b = requestNumber();
        System.out.println("Введите число 3");
        int c = requestNumber();

        if ( pif(a, b, c) == true )
        System.out.println("Указанные числа являются тройкой Пифагора");
        else
        System.out.println("Указанные числа НЕ являются тройкой Пифагора");
    }

    static boolean pif(int a, int b, int c) {
        if ((a*a + b*b == c*c) | (a*a + c*c == b*b) | (b*b + c*c == a*a))
            return true;
        else
            return false;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}