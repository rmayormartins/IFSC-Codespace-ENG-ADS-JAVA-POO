public class PecaLego {
    // Atributos (características da peça)
    String cor;
    String formato;
    int numeroDePinos;

    // Métodos (ações que a peça pode realizar)
    public void mostrarDetalhes() {
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    public void girar() {
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    // Novo método para interação entre peças
    public void empilharSobre(PecaLego outraPeca) {
        // o metodo empilha sobre vai ser chamado por um objeto que dentro dele
        // sera referenciado como "this." e o outro objeto foi determinado como um da
        // classe pecalego que sera tratado pelo nome
        // outrapeca dentro desse metodo
        System.out.println("Peça Lego " + this.cor + " foi empilhada sobre a peça Lego " + outraPeca.cor + ".");
    }

    public static void main(String[] args) {
        // Criando objetos (peças Lego reais)
        PecaLego pecaVermelha = new PecaLego();
        PecaLego pecaAzul = new PecaLego();
        PecaLego pecaAmarela = new PecaLego(); // Terceira peça

        // Definindo características da peça vermelha
        pecaVermelha.cor = "Vermelha";
        pecaVermelha.formato = "Retangular";
        pecaVermelha.numeroDePinos = 4;

        // Definindo características da peça azul
        pecaAzul.cor = "Azul";
        pecaAzul.formato = "Quadrado";
        pecaAzul.numeroDePinos = 2;

        // Definindo características da peça amarela
        pecaAmarela.cor = "Amarela";
        pecaAmarela.formato = "Circular";
        pecaAmarela.numeroDePinos = 6;

        // Fazendo as peças realizarem ações individuais
        pecaVermelha.mostrarDetalhes();
        pecaAzul.mostrarDetalhes();
        pecaAmarela.mostrarDetalhes();

        pecaVermelha.girar();
        pecaAzul.girar();
        pecaAmarela.girar();

        // Fazendo as peças interagirem
        pecaVermelha.empilharSobre(pecaAzul); // Vermelha sobre Azul
        pecaAmarela.empilharSobre(pecaVermelha); // Amarela sobre Vermelha
    }
}
