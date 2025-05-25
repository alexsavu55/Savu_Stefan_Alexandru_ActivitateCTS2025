package src.observer.main;


import src.observer.clase.Autobuz;
import src.observer.clase.Calator;
import src.observer.clase.MijlocTransport;
import src.observer.clase.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Observer calator1 = new Calator("Calator1");
        Observer calator2 = new Calator("Calator2");
        Observer calator3 = new Calator("Calator3");

        MijlocTransport autobuz = new Autobuz(100);

        autobuz.primesteObserver(calator1);
        autobuz.primesteObserver(calator2);
        autobuz.primesteObserver(calator3);

        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);

        ((Autobuz)autobuz).schimbaTraseul();
    }
}