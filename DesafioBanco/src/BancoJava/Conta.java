package BancoJava;

public abstract class Conta extends Cliente{
    protected final static String BANCO = "Meu Banco";
    protected  final static int AGENCIA = 1;
    protected static int SEQUENCIAL = 1 ;
    protected int numConta;
    protected double saldo ;
    protected Cliente cliente;

    public Conta(String nome, String cpf, String cep,
                 String estado, String cidade, String rua, int numero) {
        super(nome, cpf, cep, estado, cidade, rua, numero);
        this.numConta = SEQUENCIAL++;
        System.out.println("Conta criada");
    }


    public int getNumConta() {
        return numConta;
    }

   public void saldo(){
       System.out.println("Saldo: " + this.saldo );
   }

    public  void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente para saque ou transferencia");
        }else{
            this.saldo -= valor;
        }
    }

    public void transferir(Conta conta, double valor){
        this.sacar(valor);
        conta.depositar(valor);
    }

    public void dadosConta(){
        System.out.println("Banco: " + BANCO);
        System.out.println("Agência: " + AGENCIA);
        System.out.println("Numero da conta: " + numConta);
        System.out.println("Cliente " + getNome());
    }
}
