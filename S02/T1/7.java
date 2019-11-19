// 7 Написать функцию, которая вычисляет сумму всех четных элементов массива и произведение всех нечетных элементов массива. Функция принимает 1 аргумент - массив чисел.

import java.util.Scanner;

class test7 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        int[] a = new int[10];
        int r = 0;
        int u = 1;

        for (int i = 1; i < 5; i++) {
            a[i] = requestNumber();
            if (a[i] % 2 == 0) {
                r = r + a[i];
                System.out.println("Сумма всех чётных элементов: " + r);
            }
            if (a[i] % 2 != 0) {
                u = u * a[i];
                System.out.println("Произведение всех нечётных элементов: " + u);
            }
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}