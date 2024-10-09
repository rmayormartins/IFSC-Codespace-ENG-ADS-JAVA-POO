import java.util.Scanner;

public class C1_8Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();  // Lê a string digitada pelo usuário
        
        // Usando switch com string insensível a maiúsculas/minúsculas
        switch(dia.toLowerCase()) {  // Converte a string para minúsculas
            case "segunda":
                System.out.println("Início da semana");
                break;
            case "sexta":
                System.out.println("Quase fim de semana");
                break;
            default:
                System.out.println("Meio da semana");
        }
        
        entrada.close();
    }
}





