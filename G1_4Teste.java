public class G1_4Teste {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        str1 = str1.concat(str2.substring(0, 2));
        System.out.println("str1 = " + str1);
    }
}

