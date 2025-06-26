package examen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Firma firma = new Firma("TechSoft");

        Angajat a1 = new AngajatCuSalarFix("Maria", 3000);
        Angajat a2 = new AngajatCuSalarFix("Ion", 2800);
       
        Angajat a3 = new AngajatCuOra("Andrei", 25, 160);
        Angajat a4 = new AngajatCuOra("Ioana", 22, 170);

        firma.angajeaza(a1);
        firma.angajeaza(a2);
        firma.angajeaza(a3);
        firma.angajeaza(a4);

        System.out.println("Angajatii firmei:");
        firma.afiseazaAngajati();

        System.out.println("Salariul mediu: " + firma.salariuMediu());

        Angajat a5 = new AngajatCuSalarFix("Maria", 4000);
        if (!firma.angajeaza(a5)) {
            System.out.println("Nu se poate angaja aceeasi persoana de doua ori.");
        }

        ((AngajatCuSalarFix) a1).schimbaSalarFix(3500);
        System.out.println("Salariul mediu dupa modificare: " + firma.salariuMediu());
    }
}
