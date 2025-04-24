package Facade.src.main;

import Facade.src.clase.Masa;
import Facade.src.clase.Receptionist;

public class Main {
    public static void main(String[] args) {

        Masa masa1 = new Masa(true, 20, 4);

        Receptionist receptionist = new Receptionist();

        String mesaj1 = receptionist.poateLuaLocLaMasa(masa1);
        System.out.println(mesaj1);

        Masa masa2 = new Masa(true, 23, 5);

        System.out.println(receptionist.poateLuaLocLaMasa(masa2));

    }
}