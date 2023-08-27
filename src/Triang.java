import java.util.Scanner;

public class Triang extends Forms{
    @Override
    public void shapearea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание:");
        int a = scanner.nextInt();
        System.out.println("Введите высоту:");
        int h = scanner.nextInt();
        double s = 0.5 * a * h;
        System.out.println("S треуголинка: " + s);
    }
}
