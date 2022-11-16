package praktikum4.soal2;
import java.util.*;

/**
 *
 * @author ASUS
 */
public class soal2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner untuk menginputkan nilai inputan
        Scanner idjbuku = new Scanner(System.in);
        //pemilihan jenis buku
        System.out.println("Pilih buku yang ingin diinputkan:\n" +
                "1 = Novel\n" + "2 = Komik");
        System.out.print("Masukkan pilihan: ");
        int pilihan = idjbuku.nextInt();
        //Kondisi switch case yang dimana dipakai untuk menentukan jenis buku
        switch (pilihan) {
            //jenis novel
            case 1: {
                idjbuku.nextLine();
                System.out.print("Judul: ");
                String judul = idjbuku.nextLine();
                System.out.print("Penulis: ");
                String penulis = idjbuku.nextLine();
                System.out.print("Tahun Terbit: ");
                String tahun = idjbuku.nextLine();
                System.out.print("Genre: ");
                String genre = idjbuku.nextLine();
                System.out.print("Sinopsis: ");
                String sinopsis = idjbuku.nextLine();

                Novel bnovel = new Novel(judul, penulis, tahun, genre, sinopsis);
                System.out.println();
                bnovel.display();
                System.out.println(bnovel.getNovelDetail());
                break;
            }

            // jenis komik
            case 2: {
                idjbuku.nextLine();
                System.out.print("Judul: ");
                String judul = idjbuku.nextLine();
                System.out.print("Penulis: ");
                String penulis = idjbuku.nextLine();
                System.out.print("Tahun Terbit: ");
                String tahun = idjbuku.nextLine();
                System.out.print("Volume: ");
                String volume = idjbuku.nextLine();
                System.out.print("Sinopsis: ");
                String sinopsis = idjbuku.nextLine();

                Komik bnovel = new Komik(judul, penulis, tahun, volume, sinopsis);
                System.out.println();
                bnovel.display();
                System.out.println(bnovel.getKomikDetail());
                break;
            }
        }
    }
}
