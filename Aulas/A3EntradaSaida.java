package Aulas;
import java.util.Scanner; //Importa a classe Scanner, que é usada para ler entrada do usuário.


public class A3EntradaSaida {
   public static void main(String[] args) {
       float valor;
       Scanner scanner = new Scanner(System.in); //Cria um objeto Scanner para ler da entrada padrão (teclado).


       System.out.println("Entre com o Valor:"); //Imprime uma msg solicitando a entrada ao usuario
       valor = scanner.nextFloat(); //le um numero do ponto flutuante inserido pelo usuario
       System.out.printf("Valor eh %.2f\n", valor); //Imprime o valor inserido formatado com 2 casas decimais


       scanner.close(); //fecha o scanner
  }
}
