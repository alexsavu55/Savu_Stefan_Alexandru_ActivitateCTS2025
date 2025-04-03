package src.clase;
public class AdapterMedicament extends MedicamentFarmacie{

    private MedicamentSpital medicamentSpital;


    public AdapterMedicament(String nume, int pret, boolean stoc, String dataExpirare) {
        super(nume, pret, stoc, dataExpirare);
    }

    public AdapterMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNume(),medicamentSpital.getPret(), false,null);
        this.medicamentSpital = medicamentSpital;
    }

    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
