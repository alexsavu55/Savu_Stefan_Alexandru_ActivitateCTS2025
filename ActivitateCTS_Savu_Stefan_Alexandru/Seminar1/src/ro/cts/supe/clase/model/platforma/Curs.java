package ro.cts.supe.clase.model.platforma;

import ro.cts.supe.clase.model.personal.IPersoana;
import ro.cts.supe.clase.model.personal.IPredabil;
import ro.cts.supe.clase.model.personal.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil cadruDidactic;
    private List<Student> studenti;

    public Curs(String numeCurs, int credite, IPredabil cadruDidactic, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.cadruDidactic = cadruDidactic;
        this.studenti = studenti;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getCadruDidactic() {
        return cadruDidactic;
    }

    public void setCadruDidactic(IPredabil cadruDidactic) {
        this.cadruDidactic = cadruDidactic;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }


    public void sustinereExamen()
    {
        StringBuilder sb = new StringBuilder("Cadrul didactic ");
        sb.append(((IPersoana)this.cadruDidactic).getNume());
        sb.append(" are examen la materia ").append(this.numeCurs).append(" cu urmatorii studenti: ");
        System.out.println(sb);
        for(Student student: studenti)
        {
            System.out.println(student.getNume());
        }
    }
}
