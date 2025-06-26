package examen;

public abstract class Angajat {
    private String nume;

    public Angajat(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract double calculSalar();

    @Override
    public String toString() {
        return "Angajat: " + nume;
    }
}

