package src.teste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.clase.Persoana;
import src.exceptii.ExceptieCNPInexistent;
import src.exceptii.ExceptieCNPInvalid;

import java.awt.*;

import static org.junit.Assert.*;

public class GetVarstaTest {

    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    public void getVarstaRIGHT(){
        persoana = new Persoana("Adrian", "5031228335566");
        Assert.assertEquals(21, persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundary(){
        persoana = new Persoana("Ana", "2991231123456");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareCaractere(){
        persoana = new Persoana("Adrian", "10e0101sd3344");
        persoana.getVarsta();
    }

    @Test(timeout = 5)
    public void getVarstaPerformance(){
        persoana = new Persoana("Adrian", "5031228335566");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaCNPInexistent(){
        persoana = new Persoana("Adrian", null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana = new Persoana("Ion", "5240101335566");
        assertEquals(1, persoana.getVarsta());

    }

    @Test
    public void getVarstaCardinality0(){
        persoana = new Persoana("Ion", "52501018335566");
        assertEquals(0, persoana.getVarsta());
    }

}