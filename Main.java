public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("João da Silva", "Rua A, 123", "123.456.789-00");
        PessoaJuridica pj = new PessoaJuridica("Empresa XYZ", "Av. B, 456", "12.345.678/0001-99");

        pf.exibirDocumentoPrincipal();  // CPF: 123.456.789-00
        pj.exibirDocumentoPrincipal();  // CNPJ: 12.345.678/0001-99
    }
}
