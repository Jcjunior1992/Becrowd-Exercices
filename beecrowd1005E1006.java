package BeecrowdProblens;
import java.util.Scanner;

public class beecrowd1005E1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        Double MEDIA =  (A *  2+ B * 3 + C * 5) / 10;


        System.out.printf("MEDIA = %.1f%n", MEDIA);

    }
}
