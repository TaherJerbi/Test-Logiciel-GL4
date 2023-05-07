package junit.monprojet;

import java.util.HashMap;
public class PorteMonnaie {
    private HashMap<String, Integer> contenu;
    public HashMap<String, Integer> getContenu() {
        return contenu;
    }
    public PorteMonnaie() {
        contenu = new HashMap<String, Integer>();
    }
    public void ajouteSomme(SommeArgent sa) {
        if(contenu.containsKey(sa.getUnite())) {
            contenu.put(sa.getUnite(), contenu.get(sa.getUnite()) + sa.getQuantite());
        } else {
            contenu.put(sa.getUnite(), sa.getQuantite());
        }
    }

    @Override
    public String toString() {
        String res = "";
        for(String unite : contenu.keySet()) {
            res += contenu.get(unite) + unite + " ";
        }
        return res;
    }

    @Override
    public boolean equals(Object p) {
        if (p == null)
            return false;
        if (!(p instanceof PorteMonnaie))
            return false;

        PorteMonnaie pm = (PorteMonnaie)p;
        if (pm.getContenu().size() != contenu.size())
            return false;

        for(String unite : contenu.keySet()) {
            if (!pm.getContenu().containsKey(unite))
                return false;
            if (pm.getContenu().get(unite) != contenu.get(unite))
                return false;
        }

        return true;
    }
}
