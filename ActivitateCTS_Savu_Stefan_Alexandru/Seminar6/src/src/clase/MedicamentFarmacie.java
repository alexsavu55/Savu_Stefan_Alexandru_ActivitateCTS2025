package src.clase;

public class MedicamentFarmacie {

    private String nume;
    private int pret;
    private boolean stoc;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, int pret, boolean stoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.stoc = stoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumpararMedicament(){

        final StringBuilder sb = new StringBuilder("Medicamentul ");
        sb.append(nume).append(" pret ").append(this.pret).append(" expira ").append(this.dataExpirare);

        System.out.println(sb);
    }

}
