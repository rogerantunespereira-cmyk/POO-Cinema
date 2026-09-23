public class Filme {

    private String titulo;
    private String classificação;
    private String tema;

    public Filme(String titulo, String classificação, String tema) {
        this.titulo = titulo;
        this.classificação = classificação;
        this.tema = tema;
    }

    public void exibirDados() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Classificação: " + this.classificação);
        System.out.println("Tema: " + this.tema);
    }

    public String getTitulo() {
        return this.titulo;

    }

    public String getClassificação() {
        return this.classificação;
    }

    public String getTema() {
        return this.tema;
    }

}
