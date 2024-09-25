package Aulas;
public class G4StringSubsConcat {
    public static void main(String[] args) {
        String str1 = "Curso";
        String str2 = " de programacao Java";
        str1 = str1.concat(str2.substring(0, 15));
        System.out.println("str1 = " + str1);
    }
}
