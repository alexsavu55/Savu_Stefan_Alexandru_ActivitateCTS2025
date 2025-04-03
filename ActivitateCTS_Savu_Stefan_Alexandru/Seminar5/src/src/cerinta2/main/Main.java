package src.cerinta2.main;


import src.cerinta2.clase.Angajat;
import src.cerinta2.fabrici.*;

public class Main {
    public static void main(String[] args) {

        FactoryPersonalMedical fabricaPersonalMedical = new FactoryPersonalMedical(10.5);
        FactoryPersonalNonMEdical factoryPersonalNonMEdical = new FactoryPersonalNonMEdical(10);

        //Angajat medic = fabricaPersonalMedical.creereAngajat(TipPersonalMedical.MEDIC, "medic", 1000);

        //Angajat portar = factoryPersonalNonMEdical.creereAngajat(TipPersonalNonMedical.PORTAR, "portar", 500);`

    }
}