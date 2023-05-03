
public class Chiamata {
    private int durataInMinuti;
    private String numeroChiamato;

    public Chiamata(int durataInMinuti, String numeroChiamato) {
        this.durataInMinuti = durataInMinuti;
        this.numeroChiamato = numeroChiamato;
    }

    public int getDurataInMinuti() {
        return durataInMinuti;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }

    @Override
    public String toString() {
        return "Durata: " + durataInMinuti + " minuti, Numero chiamato: " + numeroChiamato;
    }
}

