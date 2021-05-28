package Magacin;

import java.util.ArrayList;

public class Magacin {
    private ArrayList<Artikl> artikli;
    private ArrayList<Magacioner> magacioneri;
    private ArrayList<Otpremnica> otpremnice;
    private int kapacitetPaleta;

    public Magacin() {
        this.artikli = new ArrayList<Artikl>();
        this.magacioneri = new ArrayList<Magacioner>();
        this.otpremnice = new ArrayList<Otpremnica>();
        kapacitetPaleta = 100;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }

    public void setArtikli(ArrayList<Artikl> artikli) {
        this.artikli = artikli;
    }

    public ArrayList<Magacioner> getMagacioneri() {
        return magacioneri;
    }

    public void setMagacioneri(ArrayList<Magacioner> magacioneri) {
        this.magacioneri = magacioneri;
    }

    public ArrayList<Otpremnica> getOtpremnice() {
        return otpremnice;
    }

    public void setOtpremnice(ArrayList<Otpremnica> otpremnice) {
        this.otpremnice = otpremnice;
    }

    @Override
    public String toString() {
        return "Magacin{" +
                "artikli=" + artikli +
                ", magacioneri=" + magacioneri +
                ", otpremnice=" + otpremnice +
                ", kapacitetPaleta=" + kapacitetPaleta +
                '}';
    }

    public void dodajMagacionera(Magacioner mag1) {
        magacioneri.add(mag1);

    }
    public void dodajArtikl(Artikl masina){
        artikli.add(masina);
    }
}

