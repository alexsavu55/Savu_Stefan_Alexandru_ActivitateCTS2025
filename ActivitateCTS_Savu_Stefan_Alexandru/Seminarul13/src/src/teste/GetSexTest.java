package src.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.clase.Persoana;
import src.exceptii.ExceptieCNPInexistent;
import src.exceptii.ExceptieCNPInvalid;

import static org.junit.Assert.assertEquals;

public class GetSexTest {

    @Test
    public void getSexRIGHTM(){
        Persoana persoana = new Persoana("Adrian", "5031228335566");
        Assert.assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexRIGHTF(){
        Persoana persoana = new Persoana("Adrian", "6031228335566");
        Assert.assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexBoundaryInferior(){
        Persoana persoana = new Persoana("Adrian", "1981228335566");
        Assert.assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperiror(){
        Persoana persoana = new Persoana("Adrian", "8981228335566");
        Assert.assertEquals("F", persoana.getSex());
    }


    private String getSexParitate(String CNP){
        if(CNP.charAt(0) % 2 == 0){
            return "M";
        }
        else{
            return "F";
        }
    }

    @Test
    public  void getSexCrossCheck(){
        String CNP = "5010101131415";
        Persoana persoana = new Persoana("Adrian", "8981228335566");
        assertEquals(getSexParitate(CNP), persoana.getSex());
    }


}