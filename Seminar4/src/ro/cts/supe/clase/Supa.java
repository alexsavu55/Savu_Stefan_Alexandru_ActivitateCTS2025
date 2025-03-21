package ro.cts.supe.clase;

public abstract class Supa {
    private int gramaj;
    private double pretPerSutaGr;
    private String ingrediente;

    public Supa(int gramaj, double pretPerSutaGr, String ingfrediente) {
    }

    public abstract void preparareSupa();

    public double calculPret(){
        return this.pretPerSutaGr * ((double) this.gramaj /100);
    };

    public int getGramaj() {
        return gramaj;
    }

    public double getPretPerSutaGr() {
        return pretPerSutaGr;
    }

    public String getIngrediente() {
        return ingrediente;
    }
}
