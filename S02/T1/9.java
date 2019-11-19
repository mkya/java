//9 Написать калькулятор «Конвертер перевода величин»:
//        Градусы Цельсия ó Градусы Фаренгейта.
//        Сантиметры ó Дюймы.
//        Километры ó Мили (морские).
//        Верста ó Аршин
//        Килограммы ó Фунты.
//        Литры ó Галлоны
//        Запрашивать в консоли тип калькулятора, значение (число) и порядок перевода. Проверять на ошибку ввода (см. задачу 8).

import java.util.Scanner;
import java.text.DecimalFormat;

class test9 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в «Конвертер перевода величин»");
        System.out.println("Пожалуйста выберите тип калькулятора:");
        System.out.println("1 - Градусы Цельсия ó Градусы Фаренгейта");
        System.out.println("2 - Сантиметры ó Дюймы");
        System.out.println("3 - Километры ó Мили (морские)");
        System.out.println("4 - Верста ó Аршин");
        System.out.println("5 - Килограммы ó Фунты");
        System.out.println("6 - Литры ó Галлоны");
        int k = intrequestNumber();
        switch (k) {
            case 1:
                double a = receive_text_1();
                double u = a * 1.8 + 32;
                System.out.println(a + " градуса Цельсии = " + poryadok_perevoda(u) + " градусам Фаренгейта");
                break;
            case 2:
                a = receive_text_1();
                u = a * 2.54;
                System.out.println(a + " дюймов = " + poryadok_perevoda(u) + " сантиметров");
                break;
            case 3:
                a = receive_text_1();
                u = a * 0.53995680346;
                System.out.println(a + " километров = " + poryadok_perevoda(u) + " морских миль");
                break;
            case 4:
                a = receive_text_1();
                u = a * 1500;
                System.out.println(a + " верст = " + poryadok_perevoda(u) + " аршин");
                break;
            case 5:
                a = receive_text_1();
                u = a * 2.2046;
                System.out.println(a + " киллограмм = " + poryadok_perevoda(u) + " фунта(ов)");
                break;
            case 6:
                a = receive_text_1();
                u = a * 0.26417;
                System.out.println(a + " литров = " + poryadok_perevoda(u) + " галон(ов)");
                break;
        }
    }

    static double receive_text_1() {
        System.out.println("Введите число для конвертации");
        double a = requestNumber();
        return a;
    }

    static double poryadok_perevoda(double u) {
        System.out.println("Укажите порядок перевода:");
        System.out.println("1. целое число");
        System.out.println("2. десятичное число");
        System.out.println("3. до сотых долей");
        System.out.println("4. полное значение");
        int s = intrequestNumber();
        switch (s) {
            case 1:
                DecimalFormat f1 = new DecimalFormat("##");
                u = Double.parseDouble(f1.format(u));
                return u;
            case 2:
                DecimalFormat f2 = new DecimalFormat("##.0");
                u = Double.parseDouble(f2.format(u).replace(",", "."));
                return u;
            case 3:
                DecimalFormat f3 = new DecimalFormat("##.00");
                u = Double.parseDouble(f3.format(u).replace(",", "."));
                return u;
            case 4:
                return u;
        }
        return u;
    }

    static double requestNumber() {
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        return t;
    }

    static int intrequestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}