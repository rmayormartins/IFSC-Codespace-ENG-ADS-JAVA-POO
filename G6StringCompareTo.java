public class G6StringCompareTo {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abd";
        int retorno = str1.compareTo(str2);
        System.out.println("retorno = " + retorno);
        
        // Explicação dos possíveis valores de retorno:
        // 0: conteúdo das strings são iguais
        // -1: diferença
        // < 0: str1 é lexicograficamente (ordem alfabetica) menor que str2
        // > 0: str1 é lexicograficamente (ordem alfabetica) maior que str2
    }
}

