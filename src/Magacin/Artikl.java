package Magacin;

import java.util.ArrayList;

public class Artikl {
    private long id;
    private String dobavljac;
    private String ime;
    private double paketniProstor;

    public Artikl(String imeArtikla, long id, String dobavljac, double paketniProstor) {
        this.ime = imeArtikla;
        this.id = id;
        this.dobavljac = dobavljac;
        this.paketniProstor = paketniProstor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDobavljac() {
        return dobavljac;
    }

    public void setDobavljac(String dobavljac) {
        this.dobavljac = dobavljac;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getPaketniProstor() {
        return paketniProstor;
    }

    public void setPaketniProstor(double paketniProstor) {
        this.paketniProstor = paketniProstor;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "id=" + id +
                ", dobavljac='" + dobavljac + '\'' +
                ", ime='" + ime + '\'' +
                ", paketniProstor=" + paketniProstor +
                '}';
    }

}

