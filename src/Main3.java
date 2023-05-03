public class Main3 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Mario Rossi", "mario.rossi@gmail.com", "01/01/2022");
        Cliente cliente2 = new Cliente(2, "Giuseppe Verdi", "giuseppe.verdi@gmail.com", "01/01/2021");

        Articolo articolo1 = new Articolo("A001", "Maglietta", 15.0, 10);
        Articolo articolo2 = new Articolo("A002", "Pantaloni", 30.0, 5);
        Articolo articolo3 = new Articolo("A003", "Scarpe", 50.0, 3);

        Carrello carrello1 = new Carrello(cliente1);
        Carrello carrello2 = new Carrello(cliente2);

        carrello1.aggiungiArticolo(articolo1);
        carrello1.aggiungiArticolo(articolo2);
        carrello1.aggiungiArticolo(articolo3);

        carrello2.aggiungiArticolo(articolo1);
        carrello2.aggiungiArticolo(articolo2);

        System.out.println("Carrello 1:");
        carrello1.stampaDettagli();

        System.out.println("\nCarrello 2:");
        carrello2.stampaDettagli();
    }
}
