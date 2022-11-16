package praktikum4.soal1;
//memanggil semua utility
import java.util.*;

/**
 *
 * @author ASUS
 */
public class soal1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner untuk menginputkan nilai inputan
        Scanner idatabuku = new Scanner(System.in);
        //Untuk pengimputan nilai
        System.out.print("Judul: ");
        String Judul = idatabuku.nextLine();
        System.out.print("Penulis: ");
        String Penulis = idatabuku.nextLine();
        System.out.print("Tahun Terbit: ");
        int Tahun = idatabuku.nextInt();

        //Inisialisasi objek baru
        //ini berhubungan dengan construktor
        Buku obuku = new Buku(Judul, Penulis, Tahun);

        //memberikan spasi agar output tidak terhubung
        System.out.println();
        //Memanggil method display yang berada di Buku.java yang berfungsi untuk menampilkan data
        obuku.Display();

    }
}
