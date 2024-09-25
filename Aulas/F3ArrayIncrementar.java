package Aulas;
import java.util.Scanner;

public class F3ArrayIncrementar {
    public static void main(String[] args) {
        int[] n = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Entre com 5 numeros:");
        for (int i = 0; i < 5; ++i) {
            System.out.printf("Numero %d: ", i+1);
            n[i] = scanner.nextInt();
        }
        
        System.out.printf("Primeiro numero: %d\n", n[0]);
        System.out.printf("Ultimo: %d\n", n[4]);
        
        scanner.close();
    }
}
