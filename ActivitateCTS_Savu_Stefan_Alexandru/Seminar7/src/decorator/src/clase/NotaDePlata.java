package decorator.src.clase;

public class NotaDePlata implements  Nota{

    private float totalDePlata;

    public  NotaDePlata(float totalDePlata){

    }

    @Override
    public void Printare() {
        System.out.println("aveti de plata suma de " + totalDePlata + " ron");
    }
}
