package src.strategy.main;

import src.strategy.clase.Calator;
import src.strategy.clase.CardCalatorie;
import src.strategy.clase.IMetodaPlata;
import src.strategy.clase.PlataSms;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IMetodaPlata metodaPlataCardCalatorie = new CardCalatorie(5);
        IMetodaPlata metodaPlata = new CardCalatorie(5);

        Calator corina = new Calator("Corina", metodaPlataCardCalatorie);
        corina.platesteBilet(5);
        corina.setMetodaPlata(new PlataSms());
        corina.platesteBilet(5);
        corina.setMetodaPlata(new CardCalatorie(2));
        corina.platesteBilet(5);
    }
}