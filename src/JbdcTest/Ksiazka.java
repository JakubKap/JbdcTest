package JbdcTest;

public class Ksiazka {
	
	public int id;
    public String tytul;
    public String autor;

    
    public void setId(int id) {
        this.id = id;
    }
    public void setTytul(String tytul) {
        this.tytul = tytul;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Ksiazka() {}
    public Ksiazka(int id, String tytul, String autor) {
        this.id = id;
        this.tytul = tytul;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "["+id+"] - "+tytul+" - "+autor;
    }

}
