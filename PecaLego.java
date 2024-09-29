public class PecaLego {
    // Atributos (características da peça)
    String cor;
    int numeroDePinos;
    String formato;
    boolean transparente;

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() {
 System.out.printf("Peça Lego %s com %d pinos, formato %s, %s transparente.\n", cor, numeroDePinos, formato, transparente ? "é" : "não é");
    }

    public void conectar() {
        System.out.println("Peça " + cor + " conectada a outra peça!");
    }

    public void empilhar(int quantidade) {
        System.out.println("Empilhadas " + quantidade + " peças " + cor + ".");
    }

    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        PecaLego pecaVermelha = new PecaLego();
        PecaLego pecaAzul = new PecaLego();

        // Definindo características da peça vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.numeroDePinos = 4;
        pecaVermelha.formato = "Retangular";
        pecaVermelha.transparente = false;

        // Definindo características da peça azul
        pecaAzul.cor = "Azul";
        pecaAzul.numeroDePinos = 2;
        pecaAzul.formato = "Quadrado";
        pecaAzul.transparente = true;

        // Fazendo as peças realizarem ações
        pecaVermelha.mostrarDetalhes();
        pecaAzul.mostrarDetalhes();

        pecaVermelha.conectar();
        pecaAzul.empilhar(3);
    }
}