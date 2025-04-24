package Proxy.clase;

public class ProxyNumarPersoane implements  IRezervare{
    private  IRezervare rezervare;

    public  ProxyNumarPersoane(IRezervare rezervare){
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva(String numeClient, int numarPersoane, int ora){
        System.out.println(numeClient + " are o rezervare de " + numarPersoane + " la ora " + ora);
    }
}
