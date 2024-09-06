public class TiposDeDados {
    public static void main(String[] args) {
        // Tipos primitivos
        int idade = 25;
        double altura = 1.75;
        char letra = 'A';
        boolean estudante = true;

        // String (tipo de referência)
        String nome = "João";

        // Exibindo valores
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Primeira letra do nome: " + letra);
        System.out.println("É estudante? " + estudante);

        // Operação simples
        int anoNascimento = 2024 - idade;
        System.out.println("Ano de nascimento aproximado: " + anoNascimento);
    }
}