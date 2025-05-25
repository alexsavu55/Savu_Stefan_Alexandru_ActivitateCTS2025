package src.observer.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarLinie){
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("autobuzul numarul " + this.getNumarLinie() + " pleaca de la capatul liniei");
    }

    public void schimbaTraseul(){
        trimiteMesaj("Autobuzul cu numarul " + this.getNumarLinie() + " va circula prin bd. Balcescu");
    }

}
