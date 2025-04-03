package src.clase;

public class MedicamentSpital {
    private String nume;
    private int pret;

    public MedicamentSpital(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();

        final StringBuilder sb = new StringBuilder("Medicamentul ");
        sb.append(nume).append(" costa ").append(this.pret);

        System.out.println(sb);

    }

    public void prezintaReteta(){
        System.out.println("\n A fost prezentata reteta pentru medicamentul");
        System.out.println(this.nume);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }
}
