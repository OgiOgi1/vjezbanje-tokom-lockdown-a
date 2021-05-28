package Online_Prodavnica;

public class Kupac {
    private String ime;
    private String prezime;
    private int email;
    private int brojTelefona;
    private int drzava;
    private String grad;
    private int ulica;
    private int brojKuce;

    public Kupac(String ime,String prezime, int email, int brojTelefona, int drzava, String grad, int ulica, int brojKuce){

        this.ime= ime;
        this.prezime=prezime;
        this.brojTelefona =brojTelefona;
        this.email=email;
        this.drzava = drzava;
        this.grad = grad;
        this.ulica = ulica;
        this.brojKuce = brojKuce;
    }

    public String getIme() {
        ime.length();
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getEmail() {
        return email;
    }

    public void setEmail(int email) {
        this.email = email;
    }

    public int getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(int brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public int getDrzava() {
        return drzava;
    }

    public void setDrzava(int drzava) {
        this.drzava = drzava;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public int getUlica() {
        return ulica;
    }

    public void setUlica(int ulica) {
        this.ulica = ulica;
    }

    public int getBrojKuce() {
        return brojKuce;
    }

    public void setBrojKuce(int brojKuce) {
        this.brojKuce = brojKuce;
    }

}

