public class ZZ1PecaLego {
    // Atributo (característica da peça)
    int numeroDePinos;
    int largura;
    

    public static void main(String[] args) {
        // Criando um objeto (uma peça Lego real)
        ZZ1PecaLego minhaPeca = new ZZ1PecaLego();
        
        // Definindo a característica da peça
        minhaPeca.numeroDePinos = 4;
        minhaPeca.largura = 5;
        
        
        // Mostrando a característica da peça
        System.out.println("Minha peça Lego tem " + minhaPeca.numeroDePinos + " pinos ");
        System.out.println("Minha peça Lego tem " + minhaPeca.largura + " de largura ");
    }
}
