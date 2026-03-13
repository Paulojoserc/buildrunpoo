package tech.buildrun.estadio;

public class JogadorFutebol extends Jogador {
    private  String peDominante;
    private int totalGols;

    public JogadorFutebol(String peDominante, int totalGols) {
        this.peDominante = peDominante;
        this.totalGols = totalGols;
    }

    public void driblar(){
        System.out.println("Driblando ");
    };
    public void fazerGol(){
        this.totalGols++;
    }

}
