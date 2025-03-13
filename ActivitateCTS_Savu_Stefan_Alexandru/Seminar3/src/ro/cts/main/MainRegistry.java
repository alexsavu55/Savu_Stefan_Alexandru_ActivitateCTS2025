package ro.cts.main;

import ro.cts.anunturi.Agentie;
import ro.cts.anunturi.Anunt;
public class MainRegistry {
    public static void main(String[] args){
        Agentie agentie = new Agentie("Imobiliare.ro", 120000);

        Anunt anunt = agentie.getAnunt("Piata romana", "Popescu", 3);
        Anunt anunt2 = agentie.getAnunt("Piata universitatii", "Ionescu", 2);
        Anunt anunt3 = agentie.getAnunt("Piata romana", "vasilescu", 5);

        System.out.println(anunt3.toString());
    }
}
