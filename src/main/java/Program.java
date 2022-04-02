import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {

        try{
            Integer inte = new Integer(0);
            inte += Integer.MAX_VALUE;
            System.out.println(inte-1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число для обозначения длины стороны а треугольника: ");
        int a = scanner.nextInt();
        System.out.println("Введите целое число для обозначения длины стороны b треугольника: ");
        int b = scanner.nextInt();
        System.out.println("Введите целое число для обозначения длины стороны c треугольника: ");
        int c = scanner.nextInt();
        Triangle triangle = new Triangle(a, b, c);
        System.out.println(triangle.isTriangle(triangle));

        }
        catch (Exception e)
        {
            System.out.println("Ввод не целых чисел или чисел, выходящих за значения int, запрещен.");
        }
    }
}
