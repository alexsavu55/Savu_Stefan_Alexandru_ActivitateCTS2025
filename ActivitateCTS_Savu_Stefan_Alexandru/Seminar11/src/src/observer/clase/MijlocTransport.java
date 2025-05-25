package src.observer.clase;
import java.util.ArrayList;
import java.util.List;
public abstract class MijlocTransport implements Observabil{
    private int numarLinie;
    private List<Observer> calatori;





    public int getNumarLinie() {
        return numarLinie;
    }

    public void setNumarLinie(int numarLinie) {
        this.numarLinie = numarLinie;
    }

    public List<Observer> getCalatori() {
        return calatori;
    }

    public void setCalatori(List<Observer> calatori) {
        this.calatori = calatori;
    }

    public MijlocTransport(int numarLinie){
        this.numarLinie  = numarLinie;
        this.calatori = new ArrayList<Observer>();
    }

    @Override
    public void primesteObserver(Observer observer) {
        this.calatori.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.calatori.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer calator : calatori){
            calator.primesteMesaj(mesaj);
        }
    }

    public abstract void pleacaDeLaCapat();
}
