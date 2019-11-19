// 3  Написать метод, которому на вход подаются 4 аргумента (длины сторон прямоугольного четырёхугольника) по переданным длинам сторон четырёхугольника определить: четырёхугольник - квадрат или прямоугольник.


import java.util.Scanner;


class test3 {


    public static void main(String[] args) {
        System.out.println("Введите a");
        int a = requestNumber();
        System.out.println("Введите b");
        int b = requestNumber();
        System.out.println("Введите c");
        int c = requestNumber();
        System.out.println("Введите d");
        int d = requestNumber();

        int l = kvadrator(a, b, c, d);
    }

    static int kvadrator(int a, int b, int c, int d) {
        int k = 0;
        if (a == b && a == c && a == d)
            System.out.println("Это квадрат");
        else if (a == b | a == c | a == d)
            if (b == c | b == d)
                System.out.println("Это прямоугольник");
            else if (c == d)
                System.out.println("Это прямоугольник");

            return k;
    }

        static int requestNumber () {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

    }