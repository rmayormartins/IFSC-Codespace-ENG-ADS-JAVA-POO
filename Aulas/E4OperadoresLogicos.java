package Aulas;
public class E4OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;
        
        if (a && b) {
            System.out.println("Linha 1 VERDADE");
        }
        if (a || b) {
            System.out.println("Linha 2 - VERDADE");
        }
        if (!(a && b)) {
            System.out.println("Linha 3 VERDADE");
        }
    }
}

