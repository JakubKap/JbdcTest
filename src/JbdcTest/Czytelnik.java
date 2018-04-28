package JbdcTest;

public class Czytelnik {
	
	  	public int id;
	    public String imie;
	    public String nazwisko;
	    public String pesel;

	   
	    public void setId(int id) {
	        this.id = id;
	    }
	    public void setImie(String imie) {
	        this.imie = imie;
	    }
	    public void setNazwisko(String nazwisko) {
	        this.nazwisko = nazwisko;
	    }
	    public void setPesel(String pesel) {
	        this.pesel = pesel;
	    }

	    public Czytelnik() { }
	    public Czytelnik(int id, String imie, String nazwisko, String pesel) {
	        this.id = id;
	        this.imie = imie;
	        this.nazwisko = nazwisko;
	        this.pesel = pesel;
	    }

	    @Override
	    public String toString() {
	        return "["+id+"] - "+imie+" "+nazwisko+" - "+pesel;
	    }

}
