// *** На вход метода подаётся массив целых чисел. В массиве хранятся сведения о количестве осадков выпавших за каждый день в месяце (30 дней). Определить в какие дни было максимальное и минимальное количество осадков и вывести их номера в месяце и значения осадков.

import java.util.Scanner;

class test14 {
    public static void main(String[] args) {
        int[] a = new int[31];
        System.out.println("Введите кол-во осадков за 30 дней.");
        for (int i = 0; i < 30; i++)
            a[i] = requestNumber();
        Digit(a);
    }

    private static int Digit(int a[]) {
        int r = 0;
        for (int k = 0; k < 30; k++) {
            if (r < a[k])
                r = a[k];
        }
        for (int k = 0; k < 30; k++) {
            if (a[k] == r)
                System.out.println("Максимальное кол-во осадков (" + r + ") было " + (k + 1) + "числа");
        }
        return r;
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}