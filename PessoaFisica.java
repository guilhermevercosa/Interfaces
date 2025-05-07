// Subclasse PessoaFisica
public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Física: " + nome + " - CPF: " + cpf);
    }
}
