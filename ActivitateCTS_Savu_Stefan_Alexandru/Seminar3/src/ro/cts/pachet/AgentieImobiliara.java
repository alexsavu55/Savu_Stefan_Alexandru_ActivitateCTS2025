package ro.cts.pachet;

public class AgentieImobiliara {

    private String nume;
    private int numarAnunturi;
    private String site;
    private float cifraAfaceri;
    private static AgentieImobiliara agentieImobiliara = new AgentieImobiliara("Agentie", 10, "www.Agentie.ro", 120000);

    private AgentieImobiliara(String nume, int numarAnunturi, String site, float cifraAfaceri) {
        this.nume = nume;
        this.numarAnunturi = numarAnunturi;
        this.site = site;
        this.cifraAfaceri = cifraAfaceri;
    }

    public static AgentieImobiliara getAgentieImobiliara() {
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
