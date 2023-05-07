package jmf.equation;
public class PolynomeSecondDegre {
    private double a, b, c;
    private double[] racines;
    public PolynomeSecondDegre(double a, double b, double c) { super();
        this.a = a; this.b = b; this.c = c;
    }
    public PolynomeSecondDegre() { }
    public double discriminant() { return b *b - 4 * a *c;
    }
    public double[] calculRacines() { racines = null;
        double discri = discriminant(); if (discri == 0) {
            racines = new double[1];
            racines[0] = -b / (2 * a); } else if (discri > 0) {
            double racineDiscriminant = Math.sqrt(discri); racines = new double[2];
            racines[0] = (-b + racineDiscriminant)/ (2 * a); racines[1] = (-b - racineDiscriminant)/ (2 * a);
        }
        return racines; }
}