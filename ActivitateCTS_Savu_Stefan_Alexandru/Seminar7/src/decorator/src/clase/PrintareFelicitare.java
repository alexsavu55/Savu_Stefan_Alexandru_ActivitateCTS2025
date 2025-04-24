package decorator.src.clase;

public class PrintareFelicitare implements Nota{

    private Nota notaDePlata;

    public PrintareFelicitare(Nota notaDePlata){
        this.notaDePlata = notaDePlata;
    }


    @Override
    public void Printare() {
        notaDePlata.Printare();
        printareFelicitare();
    }

    protected  void  printareFelicitare(){

    }

}
