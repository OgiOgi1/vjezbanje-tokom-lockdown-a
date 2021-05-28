package Online_Prodavnica;

public class NazivIOpisArtikala {
    private double cijena;
    private String opis;
    private String ime;
    private double tezina;

    public NazivIOpisArtikala(String imeArtikla, double cijena, String opis, double tezina) {
        this.ime = imeArtikla;
        this.cijena = cijena;
        this.opis = opis;
        this.tezina = tezina;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "NazivIOpisArtikla{" +
                "cijena=" + cijena +
                ", opis='" + opis + '\'' +
                ", ime='" + ime + '\'' +
                ", tezina=" + tezina +
                '}';
    }
}
