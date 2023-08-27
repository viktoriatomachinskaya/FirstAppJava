import java.util.Scanner;

public class Circ extends Forms{
    public void shapearea(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус:");
        int r = scanner.nextInt();
        double s = 3.14 * r * r;
        System.out.println("S круга: " + s);
    }
}
