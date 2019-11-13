//8  С клавиатуры вводятся 2 числа. Проверить делиться ли нацело, первое число на второе, если да, то вывести частное, если нет, то вывести остаток от деления. При этом указать является число частным или остатком от деления

import java.util.Scanner;


class test8 {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        double a = requestNumber();
        System.out.println("Введите введите второе число");
        double b = requestNumber();
        double k = 0;

        if (del(a, b) == true) {
            k = a / b;
            System.out.println("Число делится: " + k);
        } else {
            k = a / b;
            System.out.println("Число делится с остатком: " + k);
        }
    }

    static boolean del(double a, double b) {
        if (a % b == 0)
           return true;
        else
           return false;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}