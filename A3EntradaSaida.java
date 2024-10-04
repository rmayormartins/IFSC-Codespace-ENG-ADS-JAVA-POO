import java.util.Scanner;

public class A3EntradaSaida {
   public static void main(String[] args) {
       float valor;
       Scanner scanner = new Scanner(System.in);

       System.out.println("Entre com o Valor:");
       valor = scanner.nextFloat();
       System.out.printf("Valor eh %.2f\n", valor);

       scanner.close();
  }
}