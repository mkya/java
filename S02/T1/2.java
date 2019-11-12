// 2  На вход метода подаётся трёхзначное целое число. Найти сумму цифр, составляющих это число.


import java.util.Scanner;

class test2 {


    public static void main(String[] args) {
        System.out.println("Введите трёхзначное число");
        int a = requestNumber();
        if (a > 99 && a < 1000) {
            int v = Digit(a);
            System.out.println("Результат число: " + v);
        } else
            System.out.println("Ваше число не трёхзначное");
    }

    private static int Digit(int x) {
        String numberString = Integer.toString(x);
        int result = (Character.getNumericValue(String.valueOf(numberString).charAt(0)) + Character.getNumericValue(String.valueOf(numberString).charAt(1)) + Character.getNumericValue(String.valueOf(numberString).charAt(2)));
        return result;
    }


    static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
