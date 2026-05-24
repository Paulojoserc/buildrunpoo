package tech.buildrun.estadio;

public class Main {
    public static void main(String[] args) {

        JogadorFutebol paulo = new JogadorFutebol(
                "Paulo",
                11,
                "Esquerdo",
                5
        );

        JogadorFutebolAmericano tomBrady = new JogadorFutebolAmericano(
                "Tom Brady",
                12,
                "Arquivo com a lista de jogadas",
                350
        );
        JogadorBasquete michaelJordan = new JogadorBasquete(
                "Michael Jordan",
                99,
                2,
                500
        );


        paulo.fazerGol();
        paulo.driblar();

        System.out.println(paulo.toString());

        tomBrady.correrJardas(100);
        tomBrady.fazerTouchDown();

        System.out.println(tomBrady);

        michaelJordan.arremessar();
        michaelJordan.fazerEnterrada();
        System.out.println(michaelJordan);

    }
}
