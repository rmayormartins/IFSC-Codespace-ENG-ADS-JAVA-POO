package Aulas;
import java.util.Scanner;

public class C5SwitchCaseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Menu: Digite o item");
        System.out.println("1- Lista 1");
        System.out.println("2- Lista 2");
        System.out.println("3- Lista 3");
        
        int lista = scanner.nextInt();
        
        switch(lista) {
            case 1:
                System.out.println("Voce escolheu 1");
                break;
            case 2:
                System.out.println("Voce escolheu 2");
                break;
            case 3:
                System.out.println("Voce escolheu 3");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        
        scanner.close();
    }
}
