public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private double prezzo;
    private int disponibilita;

    public Articolo(String codiceArticolo, String descrizione, double prezzo, int disponibilita) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.disponibilita = disponibilita;
    }

    public String getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }
}
