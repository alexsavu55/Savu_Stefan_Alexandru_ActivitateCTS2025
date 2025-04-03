package src.cerinta1.main;

import src.cerinta1.clase.Pacient;
import src.cerinta1.claseVersion2.PacientBuilder;

public class MainVersion2 {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder = new PacientBuilder();

        pacientBuilder.setNumeInsotitor("georgica").setAreHalat(true).setArePapuciDeCamera(true);
        Pacient pacient1 = pacientBuilder.build("Pacient1");

        pacientBuilder.setNumeInsotitor("georgica2").setAreHalat(true).setArePapuciDeCamera(true);
        Pacient pacient2 = pacientBuilder.build("Pacient2");




        System.out.println(pacient1.toString());
        System.out.println(pacient2.toString());

    }
}