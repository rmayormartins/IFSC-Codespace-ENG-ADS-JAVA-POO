//CÓDIGO H2 - Método com parâmetros e retorno
public class OOB_2_Teste {
    public static int somar(int a, int b) {
        return a + b;
    }
    public static int subtrair(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        int resultado1 = somar(5, 3);
        int resultado2 = subtrair(5,3);
        System.out.println("Soma: " + resultado1);
        System.out.println("Subtrair: " + resultado2);
    }
}
