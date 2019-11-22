//9. На вход метода подаётся строка. Определить является ли строка палиндромом (“перевёртышем” - мадам, комок, ротор).
//chcp 65001

import java.util.Scanner;

class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку и символ");
        String a = sc.next();

        String b = new StringBuffer(a).reverse().toString();
        if(a.equals(b))
        System.out.println("Данная строка - палиндром.");
    }
}