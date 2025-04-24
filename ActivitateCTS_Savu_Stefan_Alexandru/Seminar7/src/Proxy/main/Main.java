package Proxy.main;


import Proxy.clase.IRezervare;
import Proxy.clase.ProxyNumarPersoane;
import Proxy.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        IRezervare rezervare = new Rezervare();

        rezervare.rezerva("Gigel", 5, 15);
        IRezervare proxy = (IRezervare) new ProxyNumarPersoane(rezervare);

        proxy.rezerva("Gigel", 5, 15);

    }
}