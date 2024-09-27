public class carro { // molde da classe

    // Atributos da classe
    String modelo;
    String cor;
    int ano;
    String nome; // Atributo para o nome do carro

    // Criando metodo para imprimir na tela as informacoes do carro (objeto)
    public void mostrarCarro() {
        System.out.printf("O carro %s, modelo %s, da cor %s, e ano %d\n", nome, modelo, cor, ano);
    }

    public static void main(String[] args) {

        // criando um objeto
        carro Ford = new carro();
        carro Toyota = new carro();

        // definindo atributos do primeiro carro
        Ford.nome = "Ford"; // Definindo o nome do carro
        Ford.modelo = "Focus EcoPlus"; // Definindo atributo modelo
        Ford.cor = "Branco Perolado"; // definindo atributo cor
        Ford.ano = 2022; // definindo atributo ano

        // definindo atributos do segundo carro
        Toyota.nome = "Toyota"; // Definindo o nome do carro
        Toyota.modelo = "Etios Turbo"; // Definindo atributo modelo
        Toyota.cor = "Preto"; // definindo atributo cor
        Toyota.ano = 2024; // definindo atributo ano

        // fazendo o objeto realizar a acao definida no metodo acima (mostrar as informacoes do carro)
        Ford.mostrarCarro();
        Toyota.mostrarCarro();
    }
}
