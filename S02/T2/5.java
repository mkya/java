//5. Запросить в консоли ввод ФиО  2х человек. ФиО для каждого человека вводится целиком без сокращений в 1 строку. Если имена равны, то вывести сообщение о том, что люди являются тезками.

import java.util.Scanner;

class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = new String();
        String b = new String();

        System.out.println("Введите ФиО № 1");
        a = sc.nextLine();
        System.out.println("Введите ФиО № 2");
        b = sc.nextLine();

        a = a.substring(a.indexOf(" ") + 1);
        a = a.substring(0, a.indexOf(" ") + 1);
        System.out.println(a);
        if (b.contains(a))
            System.out.println("Люди тезки");
        else
            System.out.println("имена не равны");
    }
}