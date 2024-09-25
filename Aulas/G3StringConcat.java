package Aulas;
//CODIGO G3 Manipulação de String: método concat
public class G3StringConcat {
    public static void main(String[] args) {
        String str1 = "Curso";
        String str2 = " de programacao";
        String str3 = " Java";
        
        str1 = str1.concat(str2);
        System.out.println("str1 = " + str1);
        
        // Se quiser adicionar "Java" também:
        str1 = str1.concat(str3);
        System.out.println("str1 completa = " + str1);
    }
}
