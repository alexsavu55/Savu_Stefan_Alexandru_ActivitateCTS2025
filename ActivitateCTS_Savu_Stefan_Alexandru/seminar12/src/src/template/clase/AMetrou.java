package src.template.clase;

public abstract class AMetrou {
    protected abstract void opresteStatia1();
    protected abstract void opresreStatia2();
    protected abstract void opresreStatia3();
    protected abstract void opresreStatia4();
    protected abstract void opresreStatia5();

    public final void circulaTur(){
        opresteStatia1();
        opresreStatia2();
        opresreStatia3();
        opresreStatia4();
        opresreStatia5();
    }

    public final void circulaRetur(){
        opresreStatia5();;
        opresreStatia4();
        opresreStatia3();
        opresreStatia2();
        opresteStatia1();
    }

}
