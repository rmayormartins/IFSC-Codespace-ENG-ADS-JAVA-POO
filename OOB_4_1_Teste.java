public class OOB_4_1_Teste {

    // Atributo estático (variável de classe)
    static int variavelEstatica = 10;

    public static void exemploLocal() {
        // Pode acessar a variável estática diretamente
        System.out.println("Variável estática: " + variavelEstatica);
    }

    public static void main(String[] args) {
        // Não é necessário criar um objeto para acessar a variável estática
        exemploLocal();
        
        // Acessando a variável
        System.out.println("Acessando variável estática diretamente: " + variavelEstatica);
    }
}

