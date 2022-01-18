package BancoJava;

public class ContaPoupanca extends Conta {
    public static final int TIPO = 2;


    public ContaPoupanca(String nome, String cpf, String cep,
                         String estado, String cidade, String rua, int numero) {
        super(nome, cpf, cep, estado, cidade, rua, numero);
    }

    @Override
    public void dadosConta() {
        super.dadosConta();
        System.out.println("Tipo da conta: " + TIPO);
    }
}
