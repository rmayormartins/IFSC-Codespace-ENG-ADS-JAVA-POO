public class ZZ1PecaLego {
    // Atributo (característica da peça)
    int numeroDePinos;
    int largura;
    
    public static void main(String[] args) {
        
        // Criando um objeto (uma peça Lego real)
        ZZ1PecaLego minhaPeca = new ZZ1PecaLego();
        ZZ1PecaLego minhaPeca2 = new ZZ1PecaLego();

        // Definindo o atributo (característica da peça)
        minhaPeca.numeroDePinos = 4;
        minhaPeca.largura = 5;
        
        minhaPeca2.numeroDePinos = 6;
        minhaPeca2.largura = 19;
        
        // Mostrando o atributo (característica da peça)
        System.out.println("Minha peça Lego1 tem " + minhaPeca.numeroDePinos + " pinos ");
        System.out.printf("Minha peça Lego1 tem %d", minhaPeca.numeroDePinos);
    
    }
}
