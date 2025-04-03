package src.cerinta1.main;

import src.cerinta1.clase.PacientBuilder;
import src.cerinta1.clase.Pacient;
public class Main {
    public static void main(String[] args) {

        PacientBuilder pacientBuilder = new PacientBuilder("George");

        Pacient pacient1 = pacientBuilder.setAreHalat(true).serNumeInsoritor("Georgica").getPacient();



        System.out.println(pacient1.toString());

    }
}