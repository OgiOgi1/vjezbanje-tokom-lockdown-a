package Magacin;

import java.util.ArrayList;

public class Magacioner {
    private ArrayList<PrimljeniArtikl> primljeniArtikli;
    private String ime;

    public Magacioner(String ime) {
        this.primljeniArtikli = new ArrayList<>();
        this.ime = ime;
    }

    @Override
    public String toString() {
        return "Magacioner{" +
                "primljeniArtikli=" + primljeniArtikli +
                ", ime='" + ime + '\'' +
                '}';
    }
}
