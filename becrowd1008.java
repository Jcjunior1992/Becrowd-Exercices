package BeecrowdProblens;
import java.util.Scanner;

public class becrowd1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        Double horas = scanner.nextDouble();
        Double valorhora = scanner.nextDouble();

        Double salario = horas * valorhora;

        System.out.println("NUMBER = "+ numero);
        System.out.printf("SALARY = U$ %.2f%n",salario);


    }
}
