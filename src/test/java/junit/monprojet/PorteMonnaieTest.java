package junit.monprojet;

import org.junit.Test;

import static org.junit.Assert.*;

public class PorteMonnaieTest {

    @Test
    public void ajoutSommeEquals() {
        PorteMonnaie pm = new PorteMonnaie();
        SommeArgent m5CHF = new SommeArgent(5, "CHF");
        pm.ajouteSomme(m5CHF);
        pm.ajouteSomme(m5CHF);
        SommeArgent expected = new SommeArgent(10, "CHF");
        PorteMonnaie pm2 = new PorteMonnaie();
        pm2.ajouteSomme(expected);

        assertEquals(pm2, pm);
    }
    @Test
    public void ajouteSommeUneUnite() {
PorteMonnaie pm = new PorteMonnaie();
        SommeArgent m12CHF = new SommeArgent(12, "CHF");
        SommeArgent m14CHF = new SommeArgent(14, "CHF");
        pm.ajouteSomme(m12CHF);
        pm.ajouteSomme(m14CHF);

        // Tester la methode ajouteSomme
        assertEquals(26, (int) pm.getContenu().get("CHF"));
    }

    @Test
    public void ajouteSommeDeuxUnites() {
        PorteMonnaie pm = new PorteMonnaie();
        SommeArgent m12CHF = new SommeArgent(12, "CHF");
        SommeArgent m14USD = new SommeArgent(14, "USD");

        pm.ajouteSomme(m12CHF);
        pm.ajouteSomme(m14USD);

        // Tester la methode ajouteSomme
        assertEquals(2, pm.getContenu().size());
        assertEquals(12, (int) pm.getContenu().get("CHF"));
        assertEquals(14, (int) pm.getContenu().get("USD"));
    }
}