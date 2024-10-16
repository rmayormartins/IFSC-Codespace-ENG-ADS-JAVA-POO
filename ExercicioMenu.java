import java.util.Scanner;

public class ExercicioMenu {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        
        do {
            
            System.out.println("Menu:");
            System.out.println("1 - Conversor de Números");
            System.out.println("2 - Verificador de Caracteres");
            System.out.println("3 - Retornar ao menu inicial");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();  

            
            switch (opcao) {
                case 1:
                    
                    System.out.print("Digite um número inteiro: ");
                    int numero = entrada.nextInt();
                    entrada.nextLine();  

                    
                    System.out.println("Decimal: " + numero);
                    System.out.println("Binário: " + Integer.toBinaryString(numero));
                    System.out.println("Octal: " + Integer.toOctalString(numero));
                    System.out.println("Hexadecimal: " + Integer.toHexString(numero));
                    break;

                case 2:
                    
                    System.out.print("Digite um caractere: ");
                    String input = entrada.nextLine();  

                    if (input.length() == 1) {
                        char caractere = input.charAt(0);  

                        // Verificações básicas
                        System.out.println("É letra? " + Character.isLetter(caractere));
                        System.out.println("É dígito? " + Character.isDigit(caractere));

                        // Outras verificações
                        System.out.println("É espaço em branco? " + Character.isWhitespace(caractere));
                        System.out.println("É letra maiúscula? " + Character.isUpperCase(caractere));
                        System.out.println("É letra minúscula? " + Character.isLowerCase(caractere));
                    } else {
                        System.out.println("Por favor, digite apenas um caractere.");
                    }
                    break;

                case 3:
                    
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);  

        entrada.close();  
    }
}