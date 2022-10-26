package praktikum3.soal1;
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
        //Variabel yang digunakan untuk menghitung total dadu
        int total = 0;
        //Scanner untuk menginputkan nilai inputan 
        Scanner pelemparandadu = new Scanner(System.in);
        //untuk menyimpan objek dadu
        LinkedList<Dadu> dadu = new LinkedList<Dadu>();
        int inputannilai = pelemparandadu.nextInt();

        //perulangan untuk mengacak nilai dadu
        for (int i = 0; i <= inputannilai; i++ ) {
            //add untuk menambahkan objek dadu baru
            dadu.add(new Dadu());
            //getLast() untuk mengambil objek dadu terbaru dalam perulangan 
            //memanggil acakNilaiDadu() dari main
            dadu.getLast().acakNilai();
        }
        //perulangan untuk output
        for (int i = 1; i < dadu.size(); i++) {
            //untuk menampilkan output hasil pengacakan
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.get(i).getNilai());
            //untuk menjumlahkan total nilai dadu
            //memanggil getter dari main
            total += dadu.get(i).getNilai();
        }
        //untuk menampilkan output total
        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}
