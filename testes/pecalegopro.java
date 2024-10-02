public class pecalegopro {

    String cor;
    String formato;
    int numero_de_pinos;

    public void girar() {
        System.out.println("A peça " + cor + " girou noventa graus");
    }

    public void mostrar_detalhes() {
        System.out.println("a peça " + cor + " tem " + numero_de_pinos + " pinos e seu formato é " + formato);
    }

    public void pecas_destroyer() {
        System.out.println("a peca " + cor + " foi destruida");
    }

    public static void main(String[] args) {

        pecalegopro peca_lego_vermelha = new pecalegopro();
        pecalegopro peca_lego_azul = new pecalegopro();
        pecalegopro peca_lego_verde = new pecalegopro();

        // Definindo atributos da pecalegovermelha
        peca_lego_vermelha.cor = "vermelho";
        peca_lego_vermelha.formato = "quadrado";
        peca_lego_vermelha.numero_de_pinos = 4;

        // Definindo atributos da pecalegoazul
        peca_lego_azul.cor = "azul";
        peca_lego_azul.formato = "retangulo";
        peca_lego_azul.numero_de_pinos = 6;

        // Definindo atributos da pecalegoverde
        peca_lego_verde.cor = "verde";
        peca_lego_verde.formato = "retangulo grande";
        peca_lego_verde.numero_de_pinos = 12;

        peca_lego_azul.girar();
        peca_lego_azul.mostrar_detalhes();
        peca_lego_azul.pecas_destroyer();

        peca_lego_verde.girar();
        peca_lego_verde.mostrar_detalhes();
        peca_lego_verde.pecas_destroyer();
    }
}
