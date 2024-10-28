public class G1_3_BTeste {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "ghi";
        String resultado = "";  // String vazia para acumular concatenações
        
        // Alimentando a string vazia
        resultado = resultado.concat(str1);  // Adiciona "abc"
        resultado = resultado.concat(str2);  // Adiciona "def"
        resultado = resultado.concat(str3);  // Adiciona "ghi"
        
        System.out.println("Resultado acumulado = " + resultado);  // Saída: abcdefghi
        System.out.println("str1 original = " + str1);  // Saída: abc (preservado)
    }
}
