import java.util.Scanner;

public class C1_6Teste {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
      
       System.out.println("Menu: Digite o item");
       System.out.println("1- Lista 1");
       System.out.println("2- Lista 2");
       System.out.println("3- Lista 3");
      
       int lista = entrada.nextInt();
      
       switch(lista) {
           case 1:
               System.out.println("Voce escolheu 1");
               break;
           case 2:
               System.out.println("Voce escolheu 2");
               break;
           case 3:
               System.out.println("Voce escolheu 3");
               break;
           default:
               System.out.println("Opcao invalida");
       }
      
       entrada.close();
   }
}

