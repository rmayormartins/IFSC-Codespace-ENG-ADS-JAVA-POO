import java.util.Scanner;

public class B1_2Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();
        System.out.println("Você digitou o inteiro: " + numeroInt);

        System.out.print("Digite um número decimal (float): ");
        float numeroFloat = scanner.nextFloat();
        System.out.println("Você digitou o float: " + numeroFloat);

        System.out.print("Digite um número decimal (double): ");
        double numeroDouble = scanner.nextDouble();
        System.out.println("Você digitou o double: " + numeroDouble);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.next();
        System.out.println("Você digitou a palavra: " + palavra);

        // Consumir a quebra de linha residual após a leitura do double
        scanner.nextLine();

        System.out.print("Digite uma linha de texto: ");
        String linha = scanner.nextLine();  // Lê toda a linha de texto
        System.out.println("Você digitou a linha: " + linha);

        scanner.close();
    }
}


