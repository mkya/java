//*** На вход метода подаётся массив целых чисел. Метод должен вычислить сумму всех чётных элементов, произведение всех нечётных элементов и среднее арифметическое всех элементов.

import java.util.Scanner;

class test13 {


    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Введите массив из 5-ти чисел");
        for (int i = 0; i < 5; i++)
            a[i] = requestNumber();
        Digit(a);
    }


    private static int Digit(int a[]) {
        int r = 0;
        int b = 1;
        int p = 0;
        int u = 0;
        for (int k = 0; k < 5; k++) {
            if (a[k] % 2 == 0) {
            r = r + a[k]; }
            else {
                b = b * a[k];
                u++;
            }
            p = p + a[k];
        }
        p = p/5;
        if (u == 0) b = 0;
        System.out.println("Сумма всех чётных: " + r);
        System.out.println("Произведение всех нечётных: " + b);
        System.out.println("Среднее арифметическое всех элементов: " + p);
        return r;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}