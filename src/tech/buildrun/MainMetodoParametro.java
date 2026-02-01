package tech.buildrun;

public class MainMetodoParametro {
    public static void main(String[] args) {

        Caneta canetaAmarela = new Caneta();
        canetaAmarela.cor =  "Azul";
        //canetaAmarela.tampada = false;
        canetaAmarela.ponta = 0.5;
        canetaAmarela.carga = 100;
        canetaAmarela.marca = "Bic";

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.cor = "Vermelho";
        canetaVermelha.ponta = 0.1;
        canetaVermelha.carga = 50;
        canetaVermelha.marca = "Faber Castell";
       // canetaVermelha.tampada = false;

        canetaAmarela.escrever("Olá da caneta amarela!");
        System.out.println();
        canetaVermelha.escrever("Olá da caneta vermelha!");
        System.out.println();

        canetaAmarela.status();
        canetaVermelha.status();

    }
}
