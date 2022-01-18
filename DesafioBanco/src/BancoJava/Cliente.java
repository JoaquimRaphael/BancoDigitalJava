package BancoJava;

public abstract class Cliente extends Endereco {
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    private String nome;
    private String cpf;
    private Endereco endereco;


    public Cliente(String nome, String cpf, String cep, String estado,
                   String cidade, String rua, int numero) {
        super(cep, estado, cidade, rua, numero);
        this.nome = nome;

        if(cpf.isEmpty()){
            System.out.println("Insira um cpf.");
        }else if(cpf.length() != 11){
            System.out.println("Insira os 11 numeros do cpf");
        }else{
            this.cpf = cpf;
        }

    }
}
