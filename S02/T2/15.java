//15. *** На вход подаётся строка. Распечатать произведение всех целых чисел, встречающихся в строке (под числом понимается последовательность цифровых символов, ограниченная любыми другими нецифровыми символами). Например в строке “25---/*4/+=360//-*” содержатся следующие числа: 25, 4, 360. Результат 36000.
//*** - необязательное задание
// chcp 65001

import java.util.Scanner;

class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = sc.nextLine();
        int k = 1;
        String[] arg = a.split("[\\D]+");
        for (int i = 0; i < arg.length; i++) {
            if (arg[i].matches("[\\d{1,}]+")) {
                if (Integer.parseInt(arg[i]) % 2 == 0)
                    k = k * Integer.parseInt(arg[i]);
            }
        }
        System.out.println(k);
    }
}