package ro.cts.supe.clase;

public class SupaCiuperci extends  Supa{

    public double cantitateCiuperci;

    public SupaCiuperci(int gramaj, double pretPerSutaGr, String ingfrediente, double cantitateCiuperci) {
        super(gramaj, pretPerSutaGr,ingfrediente);
        this.cantitateCiuperci = cantitateCiuperci;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa este preparata cu ciuperci");
    }

    @Override
    public double calculPret(){

        return super.calculPret() + ((cantitateCiuperci/ 100) * getPretPerSutaGr());
    }


}
