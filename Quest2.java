class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

public class Quest2 {
    public static void main(String[] args) {
        Livro livro = new Livro("X", "Y");
        System.out.println("Título: " + livro.getTitulo());
        livro.setTitulo("teste");
        System.out.println("Novo título: " + livro.getTitulo());
    }
}
