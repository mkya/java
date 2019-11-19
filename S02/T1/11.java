//*** Написать калькулятор «Расход денег на топливо для автомобиля». Запросить в консоли: расстояние пути в км, средний расход топлива на 100 км, стоимость 1-го литра топлива и вывести результат – расход топлива (в литрах) и денег (в рублях). Проверять на ошибку ввода (см. задачу 8).

import java.util.Scanner;

class test11 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в «Расход денег на топливо для автомобиля»");
        System.out.println("Пожалуйста укажите расстояния пути в км: ");
        double a = requestNumber();
        System.out.println("Пожалуйста укажите средний расход топлива на 100 км: ");
        double b = requestNumber();
        System.out.println("Пожалуйста укажите стоимсть одного литра топлива: ");
        double c = requestNumber();
        System.out.println("исходя из указанных данных расход топлива на весь путь будет: " + (a / 100 * b) + ". Стоимость поездки:" + ((a / 100 * b) * c));
    }

    static double requestNumber() {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        return t;
    }
}