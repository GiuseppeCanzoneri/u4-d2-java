public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5, 10);
        Rettangolo r2 = new Rettangolo(3, 7);

        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();

        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();

        stampaDueRettangoli(r1, r2);
    }

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Rettangolo 1:");
        r1.stampaRettangolo();
        System.out.println("Rettangolo 2:");
        r2.stampaRettangolo();

        int sommaAree = r1.calcolaArea() + r2.calcolaArea();
        int sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();
        System.out.println("Somma delle aree: " + sommaAree);
        System.out.println("Somma dei perimetri: " + sommaPerimetri);
    }
}
