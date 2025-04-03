package src.cerinta2.fabrici;

import src.cerinta2.clase.Angajat;
import src.cerinta2.clase.Asistent;
import src.cerinta2.clase.Medic;

public class FactoryPersonalNonMEdical {

    private int vechime;

    public FactoryPersonalNonMEdical(int vechime) {
        this.vechime = vechime;
    }

    public void setVechime(int vechime) {
        this.vechime = vechime;
    }

    private Angajat creereAngajat(TipPersonal tipPersonal, String nume, double salariu){
        return switch (tipPersonal){
            case PORTAR -> new Asistent(nume, salariu, vechime);
            case SECRETAR -> new Medic(nume, salariu, vechime);
            default -> null;
        }
    }

}
