package Aulas;
public class C4IfAninhado {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        
        if (a == 100) {
            // SE sim então
            if (b == 200) {
                // SE sim então
                System.out.println("Valor de a eh 100 e b eh 200");
            }
        }
    }
}
