import java.util.ArrayList;

public class Carrello {
    private Cliente cliente;
    private ArrayList<Articolo> articoli;
    private double totaleCosto;

    public Carrello(Cliente cliente) {
        this.cliente = cliente;
        this.articoli = new ArrayList<>();
        this.totaleCosto = 0.0;
    }

    public void aggiungiArticolo(Articolo articolo) {
        if (articolo.getDisponibilita() > 0) {
            this.articoli.add(articolo);
            articolo.setDisponibilita(articolo.getDisponibilita() - 1);
            this.totaleCosto += articolo.getPrezzo();
            System.out.println("Articolo " + articolo.getCodiceArticolo() + " aggiunto al carrello.");
        } else {
            System.out.println("Articolo " + articolo.getCodiceArticolo() + " non disponibile.");
        }
    }

    public void rimuoviArticolo(Articolo articolo) {
        if (this.articoli.contains(articolo)) {
            this.articoli.remove(articolo);
            articolo.setDisponibilita(articolo.getDisponibilita() + 1);
            this.totaleCosto -= articolo.getPrezzo();
            System.out.println("Articolo " + articolo.getCodiceArticolo() + " rimosso dal carrello.");
        } else {
            System.out.println("Articolo " + articolo.getCodiceArticolo() + " non presente nel carrello.");
        }
    }

    public void stampaDettagli() {
        System.out.println("Cliente: " + this.cliente.getNomeCognome());
        System.out.println("Articoli:");
        for (Articolo articolo : this.articoli) {
            System.out.println("- " + articolo.getDescrizione() + " (" + articolo.getCodiceArticolo() + "): " + articolo.getPrezzo() + " euro");
        }
        System.out.println("Totale costo: " + this.totaleCosto + " euro");
    }
}
