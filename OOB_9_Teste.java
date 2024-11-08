//metodo nao estatico (metodo de instancia)
public class OOB_9_Teste {

    // Método não estático (não estático por padrão)
    public int somar(int a, int b) {
        return a + b;
    }

    // Sobrecarga de método não estático
    public double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Criando uma instância (objeto) da classe OOB_9_Teste
        OOB_9_Teste obj = new OOB_9_Teste();

        // Chamando os métodos não estáticos através do objeto
        System.out.println("Soma de inteiros: " + obj.somar(5, 3));
        System.out.println("Soma de doubles: " + obj.somar(5.5, 3.3));
    }
}

