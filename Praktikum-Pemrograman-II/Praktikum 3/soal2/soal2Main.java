package praktikum3.soal2;
//* unutk mengimport semua utility
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
        Scanner desknegara = new Scanner(System.in);
        int input = desknegara.nextInt();
        String jenis_kepemimpinan;

        //Hashmap untuk menyimpan data bulan(memanggil dengan angka)
        HashMap<Integer, String> bulan = new HashMap<Integer, String>();
        bulan.put(1, "Januari");
        bulan.put(2, "Februari");
        bulan.put(3, "Maret");
        bulan.put(4, "April");
        bulan.put(5, "Mei");
        bulan.put(6, "Juni");
        bulan.put(7, "Juli");
        bulan.put(8, "Agustus");
        bulan.put(9, "September");
        bulan.put(10, "Oktober");
        bulan.put(11, "November");
        bulan.put(12, "Desember");

        //Linked list untuk menyimpan objek negara
        LinkedList<Negara> negara = new LinkedList<Negara>();
        //nextline = Line baru(dengan enter)
        desknegara.nextLine();
        //Perulangan untuk penginputan nilai negara
        for (int i = 0; i < input; i++) {
            String nama_negara = desknegara.nextLine();
            jenis_kepemimpinan = desknegara.nextLine();

            //kondisi untuk jenis kepemimpinan monarki
            //ignorecase untuk mengabaikan kapital
            if (jenis_kepemimpinan.equalsIgnoreCase("Monarki")) {
                String nama_pemimpin = desknegara.nextLine();
                //add untuk menambahkan objek negara baru
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin));
            //kondisi untuk jenis kepemimpinan bukan monarki
            } else {
                String nama_pemimpin = desknegara.nextLine();
                int tanggal_kemerdekaan = desknegara.nextInt();
                int bulan_kemerdekaan = desknegara.nextInt();
                bulan.get(bulan_kemerdekaan);
                int tahun_kemerdekaan = desknegara.nextInt();
                desknegara.nextLine();
                negara.add(new Negara(nama_negara, jenis_kepemimpinan, nama_pemimpin, tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan));
            }
        }

        //Perulangan untuk index
        for (int j = 0; j < negara.size(); j++) {
            //memberi baris antara nilai output yang dikeluarkan
            System.out.println();
            //untuk menampilkan output dengan kondisi monarki
             if (negara.get(j).getJenis_kepemimpinan().equalsIgnoreCase("Monarki")) {
                 negara.get(j).setJenis_kepemimpinan("Raja");
                System.out.println("Negara " + negara.get(j).getNama() + " mempunyai " + negara.get(j).toTitleCase(negara.get(j).getJenis_kepemimpinan()) + " bernama " + negara.get(j).getNama_pemimpin());
            } else {
                ////Menampilkan output dengan kondisi bukan monarki
                System.out.println("Negara " + negara.get(j).getNama() + " mempunyai " + negara.get(j).toTitleCase(negara.get(j).getJenis_kepemimpinan()) + " bernama " + negara.get(j).getNama_pemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.get(j).getTanggal_kemerdekaan() + " " + bulan.get(negara.get(j).getBulan_kemerdekaan()) + " " + negara.get(j).getTahun_kemerdekaan());
            }
        }
    }
}