public class E1_4Teste {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
       
        if (a == 1 && b == 0) {
            System.out.println("Linha 1 VERDADE");
        }
        if (a != 0 || b != 0) {
            System.out.println("Linha 2 - VERDADE");
        }
        if (!(a != 0 && b != 0)) {
            System.out.println("Linha 3 VERDADE");
        }
    }
}
