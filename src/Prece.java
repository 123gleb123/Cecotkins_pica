public class Prece {
    private String nosaukums;
    private double cena;

    public Prece(String nosaukums, double cena) {
        this.nosaukums = nosaukums;
        this.cena = cena;
    }

    public String getNosaukums() {return nosaukums;}
    public double getCena() {return cena;}
    
    public String toString() {
        return nosaukums + " — " + Math.round(cena * 100.0) / 100.0 + "€";
    }
}
