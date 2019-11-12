// 6 С клавиатуры вводится число, необходимо написать программу, которая выводит таблицу умножения чисел от 1 до 10 на заданное число. (использовать Scanner)

import java.util.Scanner;

class test6 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int a = requestNumber();
        for (int i = 1; i != 11; i++) {
            System.out.println(i + " " + (a * i));
        }
    }

    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}