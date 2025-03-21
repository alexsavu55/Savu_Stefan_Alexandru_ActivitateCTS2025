package ro.cts.supe.clase.pachet;

public class AgentieImobiliaraLazy {

    private String nume;
    private int numarAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliaraLazy agentieImobiliara = null;
    private AgentieImobiliaraLazy(String nume, int numarAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.numarAnunturi = numarAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliaraLazy getAgentieImobiliaraLazy(String nume, int numarAnunturi, String site, float cifraAfaceri) {

        if(agentieImobiliara == null) {
            agentieImobiliara = new AgentieImobiliaraLazy(nume, numarAnunturi, site, cifraAfaceri);
        }

        return agentieImobiliara;
    }

    public void setSite(String site){
        this.site = site;
    }

    public void postrazaAnunt(String anunt){
        this.numarAnunturi++;
    }

    @Override
    public String toString() {
        return "AgentieImobiliara: " +
                "nume='" + nume + '\'' +
                ", numarAnunturi=" + numarAnunturi +
                ", site='" + site + '\'' +
                ", cifraAfaceri=" + cifraAfaceri;
    }
}
