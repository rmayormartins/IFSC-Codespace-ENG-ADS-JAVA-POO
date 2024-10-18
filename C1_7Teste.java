import java.util.Scanner;

public class C1_7Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Menu: Digite a letra");
        System.out.println("A - Opção A");
        System.out.println("B - Opção B");
        System.out.println("C - Opção C");
        
        System.out.print("Escolha: ");
        char opcao = entrada.next().charAt(0);
        
        switch(Character.toUpperCase(opcao)) {
            case 'A':
                System.out.println("Você escolheu a Opção A");
                break;
            case 'B':
                System.out.println("Você escolheu a Opção B");
                break;
            case 'C':
                System.out.println("Você escolheu a Opção C");
                break;
            default:
                System.out.println("Opção inválida");
        }
        
        entrada.close();
    }
}

