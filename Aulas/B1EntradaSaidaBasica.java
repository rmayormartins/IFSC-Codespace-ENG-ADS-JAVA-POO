package Aulas;
import java.util.Scanner;

public class B1EntradaSaidaBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Valor em decimal: " + numero);
        System.out.println("Valor em octal: " + Integer.toOctalString(numero));
        System.out.println("Valor em hexadecimal: " + Integer.toHexString(numero));
        
        scanner.close();
    }
}
