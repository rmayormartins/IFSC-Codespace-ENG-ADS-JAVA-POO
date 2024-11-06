public class G1_6Teste {
    public static void main(String[] args) {
        String str1 = "Abc";
        String str2 = "abe";
        int retorno = str1.compareTo(str2);
        System.out.println("retorno = " + retorno);
       
        // Explicação dos possíveis valores de retorno:
        // 0: conteúdo das strings são iguais 
        // < 0: str1 é lexicograficamente (ordem alfabética) anterior a str2
        // > 0: str1 é lexicograficamente (ordem alfabética) posterior a str2
    }
}
