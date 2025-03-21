package ro.cts.rezervare.clase;

public abstract class ARezervare {
    protected String numeClient;
    protected int nrPersoane;
    protected String data;
    protected String ora;


    public ARezervare() {
        this.numeClient = "Necunoscut";
        this.nrPersoane = 2;
        this.data = "01.01.12";
        this.ora = "05:34";
    }

    @Override
    public String toString() {
        return "ARezervare{" +
                "numeClient='" + numeClient + '\'' +
                ", nrPersoane=" + nrPersoane +
                ", data='" + data + '\'' +
                ", ora='" + ora + '\'' +
                '}';
    }

    public ARezervare(String numeClient, int nrPersoane, String data, String ora) {

        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Necunoscut";
        }

        if(nrPersoane > 2){
            this.nrPersoane = nrPersoane;
        }

        if(data.length() == 8) {
            this.data = data;
        }

        if(ora.length() == 5) {
            this.ora = ora;
        }
    }

    public abstract void descriere();

    public abstract ARezervare copiaza();
}
