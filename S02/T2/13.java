// 13. *** По произвольной строке, полученной через консоль, вычислить количество элементов и вывести результат на экран. Проверять, что в строке нет чисел, пробелов, знаков препинания и других спецсимволов – выдавать ошибку. Например, слово «Ворота». Результат – Слово «Ворота» содержит 5 букв. Например, «Тропино4ка». Результат – В строке «Тропино4ка» есть опечатка – «4».
import java.util.Scanner;

class test13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String a = sc.nextLine();

        if (clear(a) != "")
            System.out.println("В слове «" + a + "» есть опечатка «" + clear(a) + "»");
        else System.out.println("Результат – Слово «" + a + "» содержит " + a.length() + " букв.");
    }

    private static String clear(String arg) {
    arg = arg.replaceAll("[a-z-A-Z]+", "");
        return(arg);
    }
}