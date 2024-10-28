public class G1_3_ATeste {
    public static void main(String[] args) {
        String originalStr1 = "abc";  // Valor original
        String str1 = originalStr1;   // Variável para manipulação
        String str2 = "def";
        
        // Usando método .concat()
        str1 = str1.concat(str2);
        System.out.println("str1 = " + str1);  // Saída: abcdef
        
        // Retornando ao valor original
        str1 = originalStr1;
        System.out.println("str1 original = " + str1);  // Saída: abc
    }
}