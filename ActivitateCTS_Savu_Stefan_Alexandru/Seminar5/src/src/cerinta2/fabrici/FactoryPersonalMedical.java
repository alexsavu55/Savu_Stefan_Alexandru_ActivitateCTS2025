package src.cerinta2.fabrici;

import src.cerinta2.clase.Angajat;
import src.cerinta2.clase.Asistent;
import src.cerinta2.clase.Medic;
import src.cerinta2.fabrici.TipPersonalMedical;



public class FactoryPersonalMedical {

    private double spor;

    public FactoryPersonalMedical(double spor) {
        this.spor = spor;
    }

    public void setSpor(double spor) {
        this.spor = spor;
    }

    Angajat creereAngajat(TipPersonal tipPersonal, String nume, double salriu) {
        return switch (tipPersonal){
            case ASSISTENT -> new Asistent(nume, salriu, spor);
            case MEDIC -> new Medic(nume, salriu, spor);
            default -> null;
        }
    }
}
