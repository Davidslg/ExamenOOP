package examen;

public class AngajatCuOra extends Angajat {
    private double tarifPeOra;
    private int nrOre;

    public AngajatCuOra(String nume, double tarifPeOra, int nrOre) {
        super(nume);
        this.tarifPeOra = tarifPeOra;
        this.nrOre = nrOre;
    }

    @Override
    public double calculSalar() {
        return tarifPeOra * nrOre;
    }

    public void schimbaTarif(double nou) {
        tarifPeOra = nou;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tarif: " + tarifPeOra + " | Ore: " + nrOre;
    }
}
