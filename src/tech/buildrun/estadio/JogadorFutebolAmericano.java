package tech.buildrun.estadio;

public class JogadorFutebolAmericano extends Jogador {
    private String listaJogadas;
    private int jardasConquistadas;

    public void fazerTouchDown(){
        System.out.println("Fazendo TouchDown");
    }
    public void bloquear(){
        System.out.println("Jogada bloqueando");
    }
    public void correrJardas(int jardas){
        this.jardasConquistadas += jardas;
    }
}
