//*** На вход метода подаётся массив целых чисел. Метод должен определить является ли результат сложения всех элементов массива чётным и двухзначным числом.

import java.util.Scanner;

class test12 {


    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Введите массив из 10-ти чисел");
        for (int i = 1; i < 5; i++)
            a[i] = requestNumber();
        Digit(a);
        }


    private static int Digit(int a[]) {
        int r = 0;
        for (int k = 1; k < 5; k++)
            r = r + a[k];
        if (String.valueOf(r).length() > 1)
            System.out.println("Число двухзначное");
        else
            System.out.println("Число не двухзначное");
        if (r % 2 == 0)
            System.out.println("Результат суммы всех элементов массива - чётное число = " + r);
        else
            System.out.println("Результат суммы всех элементов массива - нечётное число = " + r);
        return r;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}