package tech.buildrun.sistemabancariosimples;

public class ContaCorrente {
    private String cpf;
    private String nomeCompleto;
    private double saldo;

    ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.saldo = 0;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    void sacar(double valor){
        this.saldo -= valor;
    }
    void depositar(double valor){
        this.saldo += valor;
    }
    void transferir(double valor, ContaCorrente contaCorrente){
        this.saldo -= valor;
        contaCorrente.depositar(valor);
        System.out.println("Transferência realizada de "+this.nomeCompleto+" para "+contaCorrente.getNomeCompleto()+" com sucesso");
    }
    public void verSaldo(){
        System.out.println("O Saldo da conta do "+this.nomeCompleto+" Saldo atual: R$ " + this.saldo);
    }
}
