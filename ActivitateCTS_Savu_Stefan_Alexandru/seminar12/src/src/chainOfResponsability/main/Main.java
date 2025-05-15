package src.chainOfResponsability.main;

import src.chainOfResponsability.clase.*;

public class Main {
    public static void main(String[] args) {
        ARecomandaTransport trolebuz = new HandlerTroleibuz();
        ARecomandaTransport autobuz = new HandlerAutobuz();
        ARecomandaTransport tramvai = new HandlerTramvai();
        ARecomandaTransport metrou = new HandlerMetrou();

        trolebuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        trolebuz.recomanda(2);
        trolebuz.recomanda(5);
        trolebuz.recomanda(7);
        trolebuz.recomanda(12);
    }
}