package praktikum;

public class Kerucut extends Segitiga{
    private double jariJari;
    private double tinggiKerucut;

    public Kerucut(double alas, double tinggi, double jariJari, double tinggiKerucut) {
        super(alas, tinggi);
        this.jariJari = jariJari;
        this.tinggiKerucut = tinggiKerucut;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * Math.PI * jariJari * jariJari * tinggiKerucut;
    }
}
