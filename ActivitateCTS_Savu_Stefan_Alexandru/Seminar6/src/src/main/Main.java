package src.main;

import src.clase.AdapterMedicament;
import src.clase.MedicamentFarmacie;
import src.clase.MedicamentSpital;

public class Main {

    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumpararMedicament();
    }
    public static void main(String[] args) {

        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("med1", 100, true, "10.10.2025");
        vindeMedicament(medicamentFarmacie);

        MedicamentSpital medicamentSpital = new MedicamentSpital("med2", 56);
        AdapterMedicament adaptor = new AdapterMedicament(medicamentSpital);
        vindeMedicament(adaptor);

    }
}