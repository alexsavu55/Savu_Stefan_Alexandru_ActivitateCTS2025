package ro.cts.rezervare.main;

import ro.cts.rezervare.clase.ARezervare;
import ro.cts.rezervare.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare();


        ARezervare rezervare2 = rezervare.copiaza();
        ARezervare rezervare3 = rezervare.copiaza();

        System.out.println(rezervare2.toString());
        System.out.println(rezervare3.toString());

    }
}