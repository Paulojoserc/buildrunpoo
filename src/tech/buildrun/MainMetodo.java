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

       // Tampando a caneta
        canetaAzul.tampar();

        System.out.println("Caneta Azul criada! Cor: "+canetaAzul.cor+" tampada: "+canetaAzul.tampada);

        System.out.println("Caneta Vermelha criada! Cor: "+canetaVermelha.cor+" tampada: "+canetaVermelha.tampada);

        System.out.println("-------------------------------");
        canetaAzul.destampar();
        canetaVermelha.tampar();

        System.out.println("Caneta Azul criada! Cor: "+canetaAzul.cor+" tampada: "+canetaAzul.tampada);

        System.out.println("Caneta Vermelha criada! Cor: "+canetaVermelha.cor+" tampada: "+canetaVermelha.tampada);

    }
}
