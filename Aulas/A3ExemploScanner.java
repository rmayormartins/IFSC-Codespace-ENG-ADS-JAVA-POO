package Aulas;
import java.util.Scanner;

public class A3ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Você digitou: " + numero);
        
        scanner.close();
    }
}