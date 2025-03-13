package ro.cts.main;

import ro.cts.pachet.AgentieImobiliara;
import ro.cts.pachet.AgentieImobiliaraLazy;

public class Main {
    public static void main(String[] args) {

        AgentieImobiliara agentieImobiliara = AgentieImobiliara.getAgentieImobiliara();

        System.out.println(agentieImobiliara.toString());


        AgentieImobiliara agentieImobiliara2 = AgentieImobiliara.getAgentieImobiliara();
        agentieImobiliara2.setSite("www.siteNou.com");
        System.out.println(agentieImobiliara2.toString());

        System.out.println(agentieImobiliara.toString());

        System.out.println("________________________ L A Z Y _______________________________");

        AgentieImobiliaraLazy agentie4 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Max", 10, "ww.lazyMax.com", 10000);
        AgentieImobiliaraLazy agentie5 = AgentieImobiliaraLazy.getAgentieImobiliaraLazy("Donna", 23, "ww.lazyDonna.com", 70000);

        System.out.println(agentie5.toString());
    }
}