package ro.cts.supe.factory;

import ro.cts.supe.clase.Supa;
import ro.cts.supe.clase.SupaCiuperci;
import ro.cts.supe.clase.SupaLegume;
import ro.cts.supe.clase.SupaVita;

public class Factory {

    private int gramaj;
    private double pretPerSutaDeGrame;


    public Factory(int gramaj, double pretPerSutaDeGrame) {
        this.gramaj = gramaj;
        this.pretPerSutaDeGrame = pretPerSutaDeGrame;
    }

    public Supa getSupa(TipuriSupe supe, String ingrediente, double extra){
        switch(supe){
            case LEGUME:
                SupaLegume supaLegume = new SupaLegume(gramaj, pretPerSutaDeGrame, ingrediente, extra);
                return supaLegume;


            case VITA:
                SupaVita supaVita = new SupaVita(gramaj, pretPerSutaDeGrame, ingrediente, extra);
                return supaVita;


            case CIUPERCI:
                SupaCiuperci supaCiuperci = new SupaCiuperci(gramaj, pretPerSutaDeGrame, ingrediente, extra);
                return  supaCiuperci;

            default: return null;
        }

    }
}
