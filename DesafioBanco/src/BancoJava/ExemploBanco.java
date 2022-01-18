package BancoJava;

public class ExemploBanco {
    public static void main(String[] args) {

        ContaPoupanca conta1 = new ContaPoupanca(
                "Joaquim","25632145688","37160000","Minas Gerais",
                "Campos Gerais", "Amadeu Brasil",55);

        ContaCorrente conta2 = new ContaCorrente(
                "Raphael","25634585688","37160000","Minas Gerais",
                "Campos Gerais", "Amadeu Brasil",55);

       /* conta1.saldo();
        conta2.saldo();
        conta1.dadosConta();
        conta2.dadosConta();*/

        conta1.depositar(10000.00);
        conta1.saldo();

        conta1.transferir(conta2,5000.00);
        conta1.saldo();
        conta2.saldo();

        conta2.transferir(conta1,5900.00);
        conta2.saldo();
    }
}
