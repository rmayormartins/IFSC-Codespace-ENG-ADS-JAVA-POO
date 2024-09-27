public class PecaLego{

    int NumeroDePinos;
    int largura;

    public static void main(String[] args) {
        PecaLego minhapeca = new PecaLego();
        PecaLego minhapeca_2 = new PecaLego();

        minhapeca.NumeroDePinos = 4;
        minhapeca.largura = 5;

        minhapeca_2.NumeroDePinos = 2 + minhapeca.NumeroDePinos;
        minhapeca_2.largura = 2 + minhapeca.largura;

        System.out.println
        ("Minha peça lego tem " + minhapeca.NumeroDePinos + " Pinos\n" +
         "Minha peça lego tem " + minhapeca.largura + " de largura\n" +
         "Minha segunda peça lego tem" + minhapeca_2.NumeroDePinos + "pinos\n" + 
         "Minha segunda peça lego tem" + minhapeca_2.largura + " de largura");
    }
}
