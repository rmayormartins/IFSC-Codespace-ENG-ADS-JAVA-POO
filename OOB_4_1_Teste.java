public class OOB_4_1_Teste {
    // Variável de classe (global) com acesso público
    public static int variavel = 50;

    public static void exemploLocal() {
        //variavel de classe (local) com acesso publico tambem
        int variavel = 10;
        System.out.println("Variável local: " + variavel);
        System.out.println("Variável global: " + OOB_4_1_Teste.variavel);
    }

    public static void main(String[] args) {
        exemploLocal();
    }
}


