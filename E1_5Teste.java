
//CÓDIGO E1_5 - Operadores Condicionais Lógicos e Relacionais em Java:
public class E1_5Teste {
    public static void main(String[] args) {
        int a = 11;
       
        if ((a > 10) && (a < 20)) {
            System.out.println("maior que 10 E menor que 20");
        }
        if ((a < 10) || (a < 20)) {
            System.out.println("menor que 10 OU menor que 20");
        }
        if ((a <= 10) && (a <= 20)) {
            System.out.println("menor igual a 10 E menor igual a 20");
        }
    }
 }