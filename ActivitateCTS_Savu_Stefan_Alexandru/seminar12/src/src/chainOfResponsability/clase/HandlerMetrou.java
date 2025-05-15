package src.chainOfResponsability.clase;

public class HandlerMetrou extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta >10){
            System.out.println("Se recomanda sa iei metroul");
        }
    }
}
