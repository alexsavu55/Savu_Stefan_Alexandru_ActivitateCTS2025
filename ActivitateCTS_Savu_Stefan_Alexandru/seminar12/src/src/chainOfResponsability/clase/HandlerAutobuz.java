package src.chainOfResponsability.clase;

public class HandlerAutobuz extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 5){
            System.out.println("Se recomanda sa iei autobuzul");
        }
        else if(urmator!= null){
            urmator.recomanda(distanta);
        }
    }
}
