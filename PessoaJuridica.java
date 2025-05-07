// Subclasse PessoaJuridica
public class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void exibirDados() {
        System.out.println("Pessoa Jurídica: " + nome + " - CNPJ: " + cnpj);
    }
}

