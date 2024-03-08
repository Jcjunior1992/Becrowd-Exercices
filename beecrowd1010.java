package BeecrowdProblens;
import java.util.Scanner;

public class beecrowd1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoProduto1 = scanner.nextInt();
        int unidade1 = scanner.nextInt();
        double preco1 = scanner.nextDouble();

        int codigoProduto2 = scanner.nextInt();
        int unidade2 = scanner.nextInt();
        double preco2 = scanner.nextDouble();

        double totalpagar = (unidade1 * preco1) + (unidade2*preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalpagar);

        scanner.close();
    }
}
