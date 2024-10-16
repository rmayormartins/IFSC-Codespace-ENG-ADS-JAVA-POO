import java.util.Scanner;

public class D1_4Teste {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int lista;

       
       do {
           
           System.out.println("Menu: Digite o item");
           System.out.println("1 - Lista 1");
           System.out.println("2 - Lista 2");
           System.out.println("3 - Lista 3");
           System.out.println("4 - Voltar ao menu");
           System.out.println("0 - Sair");

           
           lista = entrada.nextInt();

           
           switch (lista) {
               case 1:
                   System.out.println("Você escolheu 1");
                   break;
               case 2:
                   System.out.println("Você escolheu 2");
                   break;
               case 3:
                   System.out.println("Você escolheu 3");
                   break;
               case 4:
                   // Volta ao menu (não precisa de ação específica, o loop já faz isso)
                   System.out.println("Voltando ao menu...");
                   break;
               case 0:
                   // Sair do loop
                   System.out.println("Saindo...");
                   break;
               default:
                   System.out.println("Opção inválida! Tente novamente.");
           }

       } while (lista != 0);  // O loop continua enquanto o usuário não digitar 0

       entrada.close();
   }
}
