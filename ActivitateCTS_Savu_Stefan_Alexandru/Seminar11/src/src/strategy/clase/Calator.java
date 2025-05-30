package src.strategy.clase;

public class Calator {
    private String nume;
    private IMetodaPlata metodaPlata;

    public Calator(String nume){
        this.nume = nume;
        metodaPlata = new CardBancar(10);
    }

    public Calator(String nume, IMetodaPlata metodaPlata){
        this.nume = nume;
        this.metodaPlata = metodaPlata; // metoda de plata specificata de utilizator
    }

    public void platesteBilet(float pretBilet){
        metodaPlata.plateste(pretBilet);
    }

    public void setMetodaPlata(IMetodaPlata metodaPlata){
        this.metodaPlata = metodaPlata;
    }
}
