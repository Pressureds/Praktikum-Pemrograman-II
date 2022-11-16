package praktikum4.soal1;

/**
 *
 * @author ASUS
 */
public class Buku {
    //Enkapsulasi dari deklarasi properti
    private String Judul;
    private String Penulis;
    private int Tahun;

    //Setter dan Getter Enkapsulasi properti/atribut
    public String getJudul() {
        return Judul;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String penulis) {
        Penulis = penulis;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int tahun) {
        Tahun = tahun;
    }

    //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
    //dibatasi dengan parameter (isinya variabel lokal)
    public Buku(String j, String p, int t) {
        Judul = j;
        Penulis = p;
        Tahun = t;
    }

    //Method untuk menampilkan output di layar
    public void Display() {
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + Judul);
        System.out.println("Penulis adalah " + Penulis);
        System.out.println("Tahun Terbit adalah " + Tahun);
    }
}