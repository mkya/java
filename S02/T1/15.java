//***На вход метода подаётся массив целых чисел.Метод должен вывести:
//
//        сначала четные элементы,затем нечетные;
//
//        сначала элементы стоящие на чётных позициях(индексах),затем на нечётных.

import java.util.Scanner;

class test15 {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println("Введите массив целых чисел (по одному целому числу, через пробел):");
        for (int i = 0; i < a.length; i++)
            a[i] = requestNumber();

        for (int k = 0; k < a.length; k++) {
            while (chetn(a[k]) && chetn_pozicia(k)) {
                System.out.println("Результат:" + a[k]);
                break;
            }
        }
        for (int k = 0; k < a.length; k++) {
            while (chetn(a[k]) && !chetn_pozicia(k)) {
                System.out.println("Результат:" + a[k]);
                break;
            }
        }
        for (int k = 0; k < a.length; k++) {
            while (!chetn(a[k]) && chetn_pozicia(k)) {
                System.out.println("Результат:" + a[k]);
                break;
            }
        }
        for (int k = 0; k < a.length; k++) {
            while (!chetn(a[k]) && !chetn_pozicia(k)) {
                System.out.println("Результат:" + a[k]);
                break;
            }
        }
    }

    private static boolean chetn(int a) {
        return (a % 2 == 0);
    }

    private static boolean chetn_pozicia(int k) {
        if (k == 0)
            return true;
        else
            return chetn(k);
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}