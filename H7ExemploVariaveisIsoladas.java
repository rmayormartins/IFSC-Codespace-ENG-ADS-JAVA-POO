public class H7ExemploVariaveisIsoladas {
    public static void FUNC1() {
        int B = -100;
        System.out.println("Valor de B dentro da função FUNC1: " + B);
    }

    public static void FUNC2() {
        int B = -200;
        System.out.println("Valor de B dentro da função FUNC2: " + B);
    }

    public static void main(String[] args) {
        int B = 10;
        System.out.println("Valor de B: " + B);
        
        B = 20;
        FUNC1();
        System.out.println("Valor de B: " + B);
        
        B = 30;
        FUNC2();
        System.out.println("Valor de B: " + B);
    }
}
