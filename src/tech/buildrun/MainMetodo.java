package tech.buildrun;

public class MainMetodo {
    public static void main(String[] args) {

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor =  "Azul";
        canetaAzul.tampada = false;
        canetaAzul.ponta = 0.5;
        canetaAzul.carga = 100;
        canetaAzul.marca = "Bic";

        Caneta canetaVermelha = new Caneta();
        canetaVermelha.cor = "Vermelho";
        canetaVermelha.ponta = 0.1;
        canetaVermelha.carga = 50;
        canetaVermelha.marca = "Faber Castell";
        canetaVermelha.tampada = false;

       canetaAzul.escrever("Olá da caneta azul!");
        System.out.println();
       canetaVermelha.escrever("Olá da caneta vermelha!");

    }
}
