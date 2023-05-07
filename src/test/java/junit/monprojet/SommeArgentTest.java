package junit.monprojet;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SommeArgentTest {

    private static int count = 1;
    private SommeArgent m12CHF;
    private SommeArgent m14CHF;

    // initialisation des instances communes à tous les tests
    @Before
    public void setUp() {

        m12CHF= new SommeArgent(12, "CHF");
        m14CHF= new SommeArgent(14, "CHF");

        System.out.println(count + "ieme passage avant exécution d'une méthode de test");
    }

    @After
    public void tearDown() {
        System.out.println(count + "ieme passage APRES exécution d'une méthode de test");
        count++;
    }
    @Test
    public void add() throws UniteDistincteException {
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF); // (2)
        assertTrue(expected.equals(result)); // (3)
    }

    @Test
    public void testEquals() {
        SommeArgent m14USD= new SommeArgent(14, "USD");
        assertTrue(!m12CHF.equals(null));
        assertEquals(m12CHF, m12CHF);
        assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
        assertTrue(!m12CHF.equals(m14CHF));

        // Tester que deux somme d'argent de monnaies differentes ne sont pas egales
        assertTrue(!m14USD.equals(m14CHF));
    }
    @Test(expected = UniteDistincteException.class)
    public void addException() throws UniteDistincteException {
        SommeArgent m12Euro = new SommeArgent(12, "Euro");
        SommeArgent m12CHF = new SommeArgent(12, "CHF");

        // Tester la methode add avec une exception
        m12Euro.add(m12CHF);
    }
}