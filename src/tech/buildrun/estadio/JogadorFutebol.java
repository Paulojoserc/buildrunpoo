package tech.buildrun.estadio;

public class JogadorFutebol extends Jogador {
    private  String peDominante;
    private int totalGols;

    public void driblar(){
        System.out.println("Driblando ");
    };
    public void fazerGol(){
        this.totalGols++;
    }

}
