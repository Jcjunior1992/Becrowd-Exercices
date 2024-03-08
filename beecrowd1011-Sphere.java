package BeecrowdProblens;
import java.util.Scanner;

public class beecrowd1011 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    double radius = scanner.nextDouble();

    double volum = (4/3.0) * 3.14159 * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volum);
    }
}
