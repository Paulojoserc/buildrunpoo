package tech.buildrun.fazenda;

public class Main {
    public static void main(String[] args) {
        Galinheiro granjaFeliz = new Galinheiro( "Granja Feliz", 50, 3);
        Galinheiro granjaOvosDeOuro = new Galinheiro("Granja Ovos De Ouro", 10, 1);


        granjaFeliz.mostraInfo();
        granjaOvosDeOuro.mostraInfo();
    }
}
