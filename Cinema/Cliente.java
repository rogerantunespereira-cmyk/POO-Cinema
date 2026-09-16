package Cinema;

public class Cliente {
     public String nome;
    public String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }


    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }

    public String getNome() {
        return this.nome;
    }
}
