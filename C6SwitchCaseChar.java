import java.util.Scanner;


public class C6SwitchCaseChar {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      
       System.out.print("Digite o conceito A, B ou C: ");
       char conceito = scanner.next().charAt(0); 
//pra aceitar o minusculo e maiusculo char conceito = Character.toUpperCase(scanner.next().charAt(0));
      
       switch(conceito) {
           case 'A': // ou pode colocar embaixo case 'a': pra aceitar ambos tamanhos
               System.out.println("Otimo");
               break;
           case 'B':
               System.out.println("Bom");
               break;
           case 'C':
               System.out.println("Ruim");
               break;
           default:
               System.out.println("Caracter invalido");
       }
      
       scanner.close();
   }
}
