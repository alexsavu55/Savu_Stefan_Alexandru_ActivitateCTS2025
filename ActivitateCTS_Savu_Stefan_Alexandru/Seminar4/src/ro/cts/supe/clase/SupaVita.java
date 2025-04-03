package ro.cts.supe.clase;

public class SupaVita extends Supa{

    private double pretExtra;

    public SupaVita(int gramaj, double pretPerSutaGr, String ingfrediente, double pretExtra) {
        super(gramaj, pretPerSutaGr, ingfrediente);
        this.pretExtra = pretExtra;
    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa este preparata cu vita");
    }

    @Override
    public double calculPret(){

        return super.calculPret() + (this.pretExtra);
    }

}
