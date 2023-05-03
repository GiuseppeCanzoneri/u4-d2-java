import java.util.ArrayList;
import java.util.List;

public class Sim {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> listaChiamate;

    public Sim(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0;
        this.listaChiamate = new ArrayList<>();
    }

    public void stampaDati() {
        System.out.println("Numero di telefono: " + this.numeroTelefono);
        System.out.println("Credito disponibile: " + this.creditoDisponibile + " euro");
        System.out.println("Lista delle ultime 5 chiamate effettuate:");
        for (int i = 0; i < this.listaChiamate.size() && i < 5; i++) {
            System.out.println("- Chiamata " + (i+1) + ": " + this.listaChiamate.get(i));
        }
    }

    public void effettuaChiamata(Chiamata chiamata) {
        this.listaChiamate.add(0, chiamata);
    }

    public void aggiornaCredito(double creditoAggiuntivo) {
        this.creditoDisponibile += creditoAggiuntivo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }
}
