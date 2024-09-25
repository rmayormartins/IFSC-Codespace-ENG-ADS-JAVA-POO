package Aulas;
public class E2Precedencia {
    public static void main(String[] args) {
        int a, b, c, d;
        
        a = (2 * 1 + (2 * 1));
        b = (2 * 1) + (2 * 1);
        c = ((2 * (1 + 2) * 1));
        d = (2 * (1 + (2 * 1)));
        
        System.out.println("valor de a b c d: " + a + " " + b + " " + c + " " + d);
        System.out.println("valor de a b c d: " + a + "\n" + b + "\n" + c + "\n" + d);
    }
}

