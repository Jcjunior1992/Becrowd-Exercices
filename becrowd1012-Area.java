package BeecrowdProblens;
import java.util.Scanner;

public class becrowd1012 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double TRIANGULO = (a*c)/2;
        double CIRCULO = 3.14159 * (c*c);
        double TRAPEZIO = (a+b)*c/2;
        double QUADRADO = b*b;
        double RETANGULO = a*b;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
    }
}
