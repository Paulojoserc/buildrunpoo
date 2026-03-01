package tech.buildrun.estadio;

public class JogadorBasquete extends Jogador{
   private int alturaSalto;
   private int totalCestas;

   public void arremessar(){
       System.out.println("Arremessando a bola");
   }
   public void fazerEnterrada(){
    this.totalCestas++;
   }
}
