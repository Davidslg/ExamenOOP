package examen;

import java.util.ArrayList;

public class Firma {
    private String nume;
    private ArrayList<Angajat> angajati;

    public Firma(String nume) {
        this.nume = nume;
        this.angajati = new ArrayList<>();
    }

    public boolean angajeaza(Angajat a) {
        for (Angajat ang : angajati) {
            if (ang.getNume().equals(a.getNume())) {
                return false; 
            }
        }
        angajati.add(a);
        return true;
    }

    public double salariuMediu() {
        if (angajati.isEmpty()) return 0;
        double total = 0;
        for (Angajat a : angajati) {
            total += a.calculSalar();
        }
        return total / angajati.size();
    }

    public void afiseazaAngajati() {
        for (Angajat a : angajati) {
            System.out.println(a);
        }
    }
}
