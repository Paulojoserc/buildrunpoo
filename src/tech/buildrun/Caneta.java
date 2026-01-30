package tech.buildrun;

public class Caneta {
    public String cor;
    public String marca;
    public double ponta;
    public int carga;
    boolean tampada;

    public void tampar() {
        this.tampada = true;

    }
    public void destampar() {
        this.tampada = false;
    }
    public void escrever(String texto) {
        System.out.print("Escrevendo: "+texto);
    }
}
