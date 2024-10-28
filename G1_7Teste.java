//CODIGO G1_7 - Comparação de Strings com equals()
public class G1_7Teste {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "java";

        // Verificação de igualdade exata
        if (str1.equals(str2)) {
            System.out.println("As strings são exatamente iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }

        // Verificação ignorando maiúsculas/minúsculas
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("As strings são iguais ignorando maiúsculas/minúsculas.");
        } else {
            System.out.println("As strings são diferentes mesmo ignorando maiúsculas/minúsculas.");
        }
    }
}

