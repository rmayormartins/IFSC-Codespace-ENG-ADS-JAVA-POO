import java.util.Scanner;

public class B1_2Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = entrada.next();
        System.out.println("Você digitou a palavra: " + palavra);
        entrada.nextLine(); 
        System.out.print("Digite uma linha de texto: ");
        String linha = entrada.nextLine();  // Lê toda a linha de texto
        System.out.println("Você digitou a linha: " + linha);

        entrada.close();
    }
}
