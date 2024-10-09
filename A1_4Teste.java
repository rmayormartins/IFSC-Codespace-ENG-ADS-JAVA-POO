import java.util.Scanner;

public class B1_1Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
       
        System.out.println("Você digitou: " + numero);
       
        scanner.close();
    }
}
 