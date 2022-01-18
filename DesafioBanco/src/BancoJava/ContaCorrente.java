package BancoJava;

public class ContaCorrente extends Conta{
    private static final int TIPO = 1;

    public ContaCorrente(String nome, String cpf, String cep,
                         String estado, String cidade, String rua, int numero) {
        super(nome, cpf, cep, estado, cidade, rua, numero);
    }

    public void saldo(){
        System.out.println("Saldo : " + this.saldo);

    }

    @Override
    public void dadosConta() {
        super.dadosConta();
        System.out.println("Tipo da conta: " + TIPO);
    }
}
