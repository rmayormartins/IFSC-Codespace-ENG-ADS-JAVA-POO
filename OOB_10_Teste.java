//Superclasse Number

public class OOB_10_Teste {

    // Método não estático que aceita qualquer tipo numérico (usando Number)
    public double somar(Number a, Number b) {
        // Converte ambos os parâmetros para double e faz a soma
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        // Criando uma instância (objeto) da classe OOB_10_Teste
        OOB_10_Teste obj = new OOB_10_Teste();

        // Chamando o método com inteiros (autoboxing ocorre aqui)
        System.out.println("Soma de inteiros: " + obj.somar(5, 3));

        // Chamando o método com doubles (autoboxing ocorre aqui também)
        System.out.println("Soma de doubles: " + obj.somar(5.5, 3.3));
    }
}
