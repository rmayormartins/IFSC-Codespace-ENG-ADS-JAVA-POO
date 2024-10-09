public class PecaLego {
    // Atributos (características da peça)
    //Aqui criamos a classe (o molde da peça), nesse caso podemos ver que
    //as caractristicas que difnem tofas as peças lego que criaremos, 
    //serãp sua cor, formato e numero de pinos.
    String cor;
    String formato;
    int numeroDePinos;

    // Métodos (ações que a peça pode realizar)
    //aqui criamos uma função, isso é basicamente uma ação que uma peça pode realizar, ou uma ação que pode ser realizada usando a peça
    //neste caso, é uma ação realizada utilizando a peça, pois aqui nós basicamente pegamos os atributos do nosso objeto e mostramos ele no terminal
    public void mostrarDetalhes() {
        System.out.println("Peça Lego " + cor + " com " + numeroDePinos + " pinos, formato " + formato + ".");
    }

    //esta função seria para exemplifiar que poderiamos interagir com o objeto, porem ela não faz nada de fato
    //apenas printa no terminal a ação que voce poderia executar com a peça, neste exemplo ela seria girada em 90 graus
    //apesar da peça não girar de fato, isto mostra bem a funcionalidade das funções em java
    public void girar() {
        System.out.println("Peça Lego " + cor + " girou 90 graus!");
    }

    // Novo método para interação entre peças
    //este metódo apesar de similar ao anterior (apenas printa algo no terminal)
    // possui caracteristicas interessantes,
    //primeiro, ele recebe argumentos, (ele ira receber um objeto do tipo PecaLego e ira tratalo dentro de si mesmo pelo nome "outraPeca")
    //outra coisa é que este metódo utiliza o this., isso se refere a peça que chama o argumento
    //veja no println que this.cor sera empilhado sobre outraPeca.cor, o this ponto seria a peça que chamou a função
    //e o outrapeca seria o argumento dado ao chamar a função
    //Ex: pec_amarela.empilharsobre(peca_verde);
    //a peça que seria atribuida ao "this" é a peça amarela, e aque seria atribuida ao "outraPeca" seria a verde
    //o this. serve para que possamos tratar do atributo que chamou a função dentro da função, sem ter que colocalo como argumento
    public void empilharSobre(PecaLego outraPeca) {
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
        pecaVermelha.empilharSobre(pecaAzul);   // Vermelha sobre Azul
        pecaAmarela.empilharSobre(pecaVermelha); // Amarela sobre Vermelha
    }
}

