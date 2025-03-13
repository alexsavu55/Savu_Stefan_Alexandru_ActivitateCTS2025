package ro.cts.anunturi;

public class Anunt {

    private String adresa;
    private String proprietar;

    private int numarCamere;
    private int nrAnunt;

    protected Anunt(String adresa, String proprietar, int numarCamere, int nrAnunt) {
        this.adresa = adresa;
        this.proprietar = proprietar;
        this.numarCamere = numarCamere;
        this.nrAnunt = nrAnunt;
    }

    @Override
    public String toString() {
        return "Anunt{" +
                "adresa='" + adresa + '\'' +
                ", proprietar='" + proprietar + '\'' +
                ", numarCamere=" + numarCamere +
                ", nrAnunt=" + nrAnunt +
                '}';
    }
}
