package src.strategy.clase;

public class PlataSms implements  IMetodaPlata{

    public PlataSms(){

    }

    @Override
    public void plateste(float pretBilet) {
        System.out.println("Plata facuta prin sms");
    }
}
