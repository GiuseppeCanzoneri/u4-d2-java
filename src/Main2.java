public class Main2 {
    public static void main(String[] args) {
        Sim miaSIM = new Sim("1234567890");

        Chiamata chiamata1 = new Chiamata(5, "1234567891");
        miaSIM.effettuaChiamata(chiamata1);

        Chiamata chiamata2 = new Chiamata(3, "1234567892");
        miaSIM.effettuaChiamata(chiamata2);

        Chiamata chiamata3 = new Chiamata(1, "1234567893");
        miaSIM.effettuaChiamata(chiamata3);
        
        Chiamata chiamata4 = new Chiamata(1, "1234567893");
        miaSIM.effettuaChiamata(chiamata4);
        
        miaSIM.aggiornaCredito(5.0);

        miaSIM.stampaDati();
    }
}
