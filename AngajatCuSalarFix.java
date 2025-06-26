package examen;

public class AngajatCuSalarFix extends Angajat {
    private double salarFix;

    public AngajatCuSalarFix(String nume, double salarFix) {
        super(nume);
        this.salarFix = salarFix;
    }

    @Override
    public double calculSalar() {
        return salarFix;
    }

    public void schimbaSalarFix(double nou) {
        salarFix = nou;
    }

    @Override
    public String toString() {
        return super.toString() + " | Salariu fix: " + salarFix;
    }
}

