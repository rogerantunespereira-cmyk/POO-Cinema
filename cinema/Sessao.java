public class Sessao {
    private String filme;
    private int assentos;
    private String horario;

    public Sessao(String filme, int assentos, String horario) {
        this.filme = filme;
        this.assentos = assentos;
        this.horario = horario;
    }

    public void exibirDados() {
        System.out.println("Filme: " + this.filme);
        System.out.println("Assentos disponíveis: " + this.assentos);
        System.out.println("Horário: " + this.horario);
    }

    public String getFilme() {
        return this.filme;
    }

    public int getAssentos() {
        return this.assentos;
    }

    public String getHorario() {
        return this.horario;
    }

}