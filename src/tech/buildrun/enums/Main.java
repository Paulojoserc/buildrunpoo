package tech.buildrun.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       Usuario paulo = new Usuario("Paulo", NivelAcesso.ADMIN, "paulo@gmail.com");
       Usuario pedro = new Usuario("Pedro", NivelAcesso.USUARIO, "pedro@gmail.com");
       Usuario carlos = new Usuario("Carlos",NivelAcesso.CONVIDADO, "carlos@hotmail.com");

       paulo.maostrarInfo();
        System.out.println();
        pedro.maostrarInfo();
        System.out.println();
        carlos.maostrarInfo();

    }
}
