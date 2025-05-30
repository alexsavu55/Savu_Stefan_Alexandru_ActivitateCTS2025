package src.strategy.clase;

public class CardBancar implements  IMetodaPlata{

    float sold;

    public CardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata cu card bancar");
    }
}
