package junit.monprojet;
public class SommeArgent {
    private int quantite;
    private String unite;
    public SommeArgent(int amount, String currency) {
        quantite = amount;
        unite = currency;
    }
    public int getQuantite() {
        return quantite;
    }
    public String getUnite() {
        return unite;
    }
    public SommeArgent add(SommeArgent m) throws UniteDistincteException {
        if (!m.getUnite().equals(getUnite()))
            throw new UniteDistincteException(this, m);

        return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
    }

    public boolean equals(SommeArgent m) {
        if (m == null)
            return false;
        return getQuantite() == m.getQuantite() && getUnite().equals(m.getUnite());
    }
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SommeArgent))
            return false;
        return equals((SommeArgent)obj);
    }

    @Override
    public String toString() {
        return getQuantite() + getUnite();
    }
}