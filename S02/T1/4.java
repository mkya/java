// 4  известны координаты двух точек. Составить программу вычисления расстояния между ними.
import java.util.Scanner;

class test4 {
    public static void main(String[] args) {
        System.out.println("Введите x1");
        double x1 = requestNumber();
        System.out.println("Введите x2");
        double x2 = requestNumber();
        System.out.println("Введите y1");
        double y1 = requestNumber();
        System.out.println("Введите y2");
        double y2 = requestNumber();

        System.out.println("Расстояние бежду двумя точками: " + distance(x1, x2, y1, y2));
    }

    static double distance(double x1, double x2, double y1, double y2) {
        double distance = Math.hypot(x1 - x2, y1 - y2);
        return distance;
    }

    static double requestNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

