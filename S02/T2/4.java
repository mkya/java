//4. На вход метода подаётся строка и символ. Метод должен посчитать кол-во вхождений символа в строку и вернуть строку без этого (этих) символа(ов). В решении задачи использовать StringBuilder. Например для строки “JBorn” и символа “r” результатом будет: Количество вхождений символа: 1

import java.util.Scanner;

class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сторону - а");
        String a = new String();
        String b = new String();
        a = sc.nextLine();
        System.out.println("Введите символ - b");
        if (b.length() < 1) {
            b = sc.nextLine();
            char l = b.charAt(0);  // пытался сделать что бы брал именно первую букву из полученного массива b, но не разобрался (например в b написали 5absg5a - вернуть a)
            System.out.println(Digit(a, l));
        }

    }

    private static String Digit(String b, char l) {
        char r = 0;
        for (int i = 0; i < b.length(); i++) {
            b = b.replaceAll(Character.toString(l), "");
            r++;
        }
        System.out.println(r);
        return (b);
    }
}