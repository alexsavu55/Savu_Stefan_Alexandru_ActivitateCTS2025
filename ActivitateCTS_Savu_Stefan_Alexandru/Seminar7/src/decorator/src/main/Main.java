package decorator.src.main;

import decorator.src.clase.Nota;
import decorator.src.clase.NotaDePlata;
import decorator.src.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args) {

        Nota notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.Printare();

        Nota notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.Printare();


    }
}