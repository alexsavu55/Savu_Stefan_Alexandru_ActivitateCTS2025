package ro.cts.supe.clase;

public class SupaLegume extends Supa{

    private double gramajCrutoane;

    public SupaLegume(int gramaj, double pretPerSutaGr, String ingrediente, double gramajCrutoane) {

        super(gramaj, pretPerSutaGr, ingrediente);
        this.gramajCrutoane = gramajCrutoane;

    }

    @Override
    public void preparareSupa() {
        System.out.println("Supa este preparata cu legume");
    }

    @Override
    public double calculPret(){

        return super.calculPret() + ((gramajCrutoane/ 100) * getPretPerSutaGr());
    }

}
