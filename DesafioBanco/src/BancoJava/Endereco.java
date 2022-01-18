package BancoJava;

public abstract class Endereco {

    private String cep;
    private String estado;
    private String cidade;
    private String rua;
    private int numero;

    public Endereco(String cep, String estado, String cidade, String rua, int numero) {
        if(cep.isEmpty()){
            System.out.println("Insira o cep!");
        }else if (cep.length() != 8){
            System.out.println("O cep deve conter 8 numeros");
        }else{
            this.cep = cep;
        }
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }
}
