package tech.buildrun.sistemabancariosimples;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaPaulo = new ContaCorrente("65874897812","contaPaulo Costa");
        contaPaulo.depositar(100);
        contaPaulo.sacar(10);
        contaPaulo.verSaldo();

        ContaCorrente contaFilho = new ContaCorrente("454687912","Filho da Costa");
        contaPaulo.transferir( 50, contaFilho );
        contaPaulo.verSaldo();
        contaFilho.verSaldo();

    }
}
