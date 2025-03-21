package ro.cts.rezervare.clase;

public class Rezervare extends ARezervare{

    @Override
    public void descriere() {

    }

    @Override
    public ARezervare copiaza() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.data = this.data;
        rezervareNoua.ora = this.ora;
        return rezervareNoua;
    }
}
