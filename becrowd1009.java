package BeecrowdProblens;
import java.util.Scanner;

public class becrowd1009 {
    public static void main(String[] args) {
        
       

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        Double salario = scanner.nextDouble();
        Double venda = scanner.nextDouble();

        Double total = (venda * 0.15) + salario;

        System.out.printf("TOTAL R$ %.2f%n",total);


            }
        }

