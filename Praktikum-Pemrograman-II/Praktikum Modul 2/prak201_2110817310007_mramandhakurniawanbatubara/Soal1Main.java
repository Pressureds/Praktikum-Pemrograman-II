package prak201_2110817310007_mramandhakurniawanbatubara;

/**
 *
 * @author ASUS
 */
public class Soal1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objek untuk buah mangga jenis Arumanis
        //ini berhubungan dengan construktor karena construktor akan mengambil data dari dalam sini
        Buah Arumanis = new Buah("Arumanis","hijau kekuning-kuningan", "lembut", "manis", 0.3, 13, 5000);
        //Objek untuk buah mangga jenis  Manalagi
        //ini berhubungan dengan construktor karena construktor akan mengambil data dari dalam sini
        Buah Manalagi = new Buah("Manalagi", "hijau", "kasar", "manis", 0.5, 17, 7500);
        //Objek untuk buah mangga jenis Madu
        Buah Madu = new Buah("Madu", "Kuning", "lembut", "manis", 0.375, 12, 6500);
        
        //Memanggil method display yang berada di Buah.java yang berfungsi untuk menampilkan data
        Arumanis.display();
        Manalagi.display();
        Madu.display();
    }
}
