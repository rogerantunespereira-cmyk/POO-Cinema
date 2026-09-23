public class Ingresso {
    
    private String valor;
    private Sessao sessao;
    private String assento;
    private Cliente cliente;
    
    public Ingresso(String valor, Sessao sessao, String assento, Cliente cliente) {
        this.valor = valor;
        this.sessao = sessao;
        this.assento = assento;
        this.cliente = cliente;
    }

    public void exibirDados() {
        System.out.println("Valor: " + this.valor);
        System.out.println("Sessão: " + this.sessao.getFilme());
        System.out.println("Assento: " + this.assento);
        System.out.println("Cliente: " + this.cliente.getNome());
    }

    public String getValor() {
        return this.valor;
    }

    public Sessao getSessao() {
        return this.sessao;
    }

    public String getAssento() {
        return this.assento;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

}