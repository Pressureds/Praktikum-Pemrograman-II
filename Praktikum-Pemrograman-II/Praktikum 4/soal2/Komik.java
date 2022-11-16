package praktikum4.soal2;

/**
 *
 * @author ASUS
 */
//konsep inheritance dengan extends
public class Komik extends Buku {
    //Enkapsulasi dari deklarasi properti sesuai yang diminta oleh soal
    private String volume;
    private String sinopsis;
    
    //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
    //dibatasi dengan parameter (isinya variabel lokal)
    public Komik(String j, String p, String t, String v, String s) {
        judul = j;
        penulis = p;
        this.tahun = Integer.parseInt(t);
        this.volume = v;
        this.sinopsis = s;
    }

    //Method untuk mengembalikan string dari atribut
    public String getKomikDetail() {
        return "Sebuah komik dengan judul \""+ this.judul + "\" Komik tersebut dibuat oleh \n"+ this.penulis +
                "dan diterbitkan pada tahun "+ this.tahun +  ". Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + this.volume+ " buah.\n" +
                "Sinopsis : " + this.sinopsis.substring(0, 64) + "...";
    }
}