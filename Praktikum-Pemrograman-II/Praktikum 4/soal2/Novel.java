package praktikum4.soal2;

/**
 *
 * @author ASUS
 */
//konsep inheritance dengan extends
public class Novel extends Buku{
    //Enkapsulasi dari deklarasi properti
    private String genre;
    private String sinopsis;

    //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
    //dibatasi dengan parameter (isinya variabel lokal)
    public Novel(String j, String p, String t, String g, String s) {
        judul = j;
        penulis = p;
        this.tahun = Integer.parseInt(t);
        this.genre = g;
        this.sinopsis = s;
    }

    //Mengembalikan nilai String untuk mendapatkan isi data pada atribut
    public String getNovelDetail() {
        return "Sebuah novel bergenre "  + this.genre.substring(0,1).toUpperCase() + this.genre.substring(1) + " dengan judul \"" + this.judul + "\" Novel tersebut ditulis oleh \n"+ this.penulis +
                " dan diterbitkan pada tahun "+ this.tahun + ".\n" +
                "Sinopsis : " + this.sinopsis.substring(0, 60) + "....";
    }


}