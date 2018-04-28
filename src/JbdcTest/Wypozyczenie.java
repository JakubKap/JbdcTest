package JbdcTest;

public class Wypozyczenie {
	
	public int idWypozycz;
    public int idCzytelnik;
    public int idKsiazka;
    
    
    public void setIdWypozycz(int idWypozycz) {
        this.idWypozycz = idWypozycz;
    }
    public void setIdCzytelnik(int idCzytelnik) {
        this.idCzytelnik = idCzytelnik;
    }
    public void setIdKsiazka(int idKsiazka) {
        this.idKsiazka = idKsiazka;
    }


    public Wypozyczenie() {}
    public Wypozyczenie(int idWypozycz, int idCzytelnik, int idKsiazka) {
    	this.idWypozycz= idWypozycz;
    	this.idCzytelnik = idCzytelnik;
        this.idKsiazka = idKsiazka;

        
    }
    public String toString() {
        return "idWypozycz["+idWypozycz+"] - idCzytelnik["+idCzytelnik+"] idKsiazka["+idKsiazka+"]";
    }


}
