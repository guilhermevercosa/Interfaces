// Classe principal para testar
public class Main {
    public static void main(String[] args) {
        Pessoa pf = new PessoaFisica("João da Silva", "123.456.789-00");
        Pessoa pj = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-99");

        pf.exibirDados();
        pj.exibirDados();
    }
}
