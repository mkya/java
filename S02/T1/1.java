// 1 Написать метод, аргументами которого являются 4 числа (1- делитель, остальные 3 - делимое). Определить какие и сколько чисел, делятся на делитель нацело.

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        System.out.println("Set a");
        int a = requestNumber();
        System.out.println("Set b");
        int b = requestNumber();
        System.out.println("Set c");
        int c = requestNumber();
        System.out.println("Set d");
        int d = requestNumber();

        int k = 0;
        if (b % a == 0) {
            System.out.println("Chislo d = " + b + " delitsya na chislo a = " + a);
            k++;
        }
        if (c % a == 0) {
            System.out.println("Chislo d = " + c + " delitsya na chislo a = " + a);
            k++;
        }
        if (d % a == 0) {
            System.out.println("Chislo d = " + d + " delitsya na chislo a = " + a);
            k++;
        }
        System.out.println("kol-vo delitetelei: " + k);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
