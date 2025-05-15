package src.chainOfResponsability.clase;

public class HandlerTroleibuz extends ARecomandaTransport{

    @Override
    public void recomanda(int distanta) {
        if (distanta <= 10){
            System.out.println("Se recomanda sa iei troileibuzul");
        }else if (urmator!= null) {
            urmator.recomanda(distanta);
        }
    }
}
