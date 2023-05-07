package jmf.equation;

import org.junit.Test;

import static org.junit.Assert.*;

public class PolynomeSecondDegreTest {

    @Test
    public void test2Racines() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, 1, -2);
        double[] racines = p.calculRacines();
        assertEquals(2, racines.length);
        assertEquals(1, racines[0], 0.0001);
        assertEquals(-2, racines[1], 0.0001);
    }

    @Test
    public void test1Racine() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, -2, 1);
        double[] racines = p.calculRacines();
        assertEquals(1, racines.length);
        assertEquals(1, racines[0], 0.0001);
    }

    @Test
    public void testPasDeRacineReelle() {
        PolynomeSecondDegre p = new PolynomeSecondDegre(1, 1, 1);
        double[] racines = p.calculRacines();
        assertNull(racines);
    }
}