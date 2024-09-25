package Aulas;
import java.util.Scanner;

public class B3EntradaECalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.printf("Olá, %s! Sua média é: %.2f\n", nome, media);
        
        scanner.close();
    }
}
