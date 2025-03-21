package ro.cts.supe.main;

import ro.cts.supe.clase.Supa;
import ro.cts.supe.factory.Factory;
import ro.cts.supe.factory.TipuriSupe;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory(200, 10);

        Supa supaLegume = factory.getSupa(TipuriSupe.LEGUME, "Apa, legume", 100);
        supaLegume.preparareSupa();


        Supa supaVita = factory.getSupa(TipuriSupe.VITA, "Apa, vita", 100);
        supaVita.preparareSupa();

        Supa supaCiuperci = factory.getSupa(TipuriSupe.CIUPERCI, "Apa, ciuperci", 100);
        supaCiuperci.preparareSupa();
    }
}