// 10  Написать функцию, которая считает площадь круга, а также длину окружности по его радиусу. Функция принимает 1 аргумент - радиус.

import java.util.Scanner;

class test10 {

    public static void main(String[] args) {
        System.out.println("Введите радиус окружности");
        double r = requestNumber();
        System.out.println("Площадь круга = " + (r*r*3.1415) + ", его длина окружности = " + (2*r*3.14159));
    }

    static double requestNumber() {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        return t;
    }
}