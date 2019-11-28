// 12. *** Произвольную строку, полученную через консоль, записать в обратном порядке с заменого регистра на противоположный с выводом в консоль. Например, «РаботА нЕ вОЛК». Результат: «клоВ еН аТОБАр».

import java.util.Scanner;

class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = sc.next();
        String b = new StringBuffer(a).reverse().toString();
        String c = new String();

        for (int i = 0; i < b.length(); i++) {
            a = Character.toString(b.charAt(i)).toUpperCase();
            c = Character.toString(b.charAt(i));
            // if (Character.toString(b.charAt(i)) == Character.toString(b.charAt(i)).toUpperCase())  Пытался сдедать так, но видимо так нельзя.
            if (a.equals(c))
                System.out.print(Character.toString(b.charAt(i)).toLowerCase());
            else
                System.out.print(Character.toString(b.charAt(i)).toUpperCase());
        }
    }
}