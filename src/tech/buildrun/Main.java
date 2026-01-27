package tech.buildrun;

public class Main {
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

        //Tampando a caneta
        canetaAzul.tampar();

        System.out.println("Caneta azul criada! "+"\n Cor: "+canetaAzul.cor+ "\n Marca: "+canetaAzul.marca+"\n Tampada: " +canetaAzul.tampada);
        System.out.println();
        System.out.println("Caneta vermelha criada! "+"\n Cor: "+canetaVermelha.cor+ "\n Marca: "+canetaVermelha.marca+ "\n Tampada: " +canetaVermelha.tampada);


        System.out.println("-----------------");

        canetaAzul.destampar();
        canetaVermelha.tampar();
        System.out.println("Caneta azul criada! "+"\n Cor: "+canetaAzul.cor+ "\n Marca: "+canetaAzul.marca+"\n Tampada: " +canetaAzul.tampada);
        System.out.println();
        System.out.println("Caneta vermelha criada! "+"\n Cor: "+canetaVermelha.cor+ "\n Marca: "+canetaVermelha.marca+ "\n Tampada: " +canetaVermelha.tampada);

    }
}
