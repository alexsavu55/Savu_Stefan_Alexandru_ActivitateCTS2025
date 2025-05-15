package src.template.main;


import src.template.clase.AMetrou;
import src.template.clase.Metrou;
import src.template.clase.MetrouSpecial;

public class Main {
    public static void main(String[] args) {

        AMetrou metrou = new Metrou(2);
        AMetrou metrouSpecial = new MetrouSpecial();

        metrou.circulaTur();
        System.out.println("\n");
        metrou.circulaRetur();
        System.out.println("\n\n\n");

        metrouSpecial.circulaTur();
        System.out.println("\n");
        metrouSpecial.circulaRetur();
    }
}