package src.observer.clase;

public interface Observabil {
    void primesteObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteMesaj(String mesaj);

}
