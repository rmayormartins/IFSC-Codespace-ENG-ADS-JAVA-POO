class Cofre {

    private String senha;

    public void definirSenha(String novaSenha) {
        if (novaSenha.length() >= 6) {
            this.senha = novaSenha;
            System.out.println("Senha definida com sucesso.");
        } else {
            System.out.println("A senha deve ter pelo menos 6 caracteres.");
        }
    }

    public void mostrarSenha() {
        System.out.println("Senha: " + this.senha);
    }
}

public class Quest1 {
    public static void main(String[] args) {
        Cofre cofre = new Cofre();
        cofre.definirSenha("minhaSenha"); 
        cofre.mostrarSenha();
    }
}





