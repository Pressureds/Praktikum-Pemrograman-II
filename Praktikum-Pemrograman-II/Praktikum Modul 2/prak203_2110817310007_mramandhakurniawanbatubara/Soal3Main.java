package prak203_2110817310007_mramandhakurniawanbatubara;

/**
 *
 * @author ASUS
 */
public class Soal3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

            //Pada baris ini terjadi error karena tidak ada titik koma diujung setelah inputan data ("")
            //p1.nama = "Roi"
            p1.nama = "Roi";
            p1.asal = "Kingdom of Orvel";
            
            /*terjadi error disini karena properti/atribut/field yang seharusnya berisikan umur
              belum dideklarasikan yang akan menyebabkan print outputnya mengeluarkan nilai 0
              pada bagian umur
            */
            p1.umur=17;
            p1.setJabatan("Assasin");
            
            /*terdapat ketidaksamaan pada output dengan kode print
              karena pada output tidak ada tulisan pegawai pada "Nama Pegawai: "
              agar sama dengan output maka Pegawainya dihilangkan
            */
            //System.out.println("Nama Pegawai: " + p1.getNama());
            System.out.println("Nama: " + p1.getNama());
            System.out.println("Asal: " + p1.getAsal());
            System.out.println("Jabatan: " + p1.jabatan);
            
            /*
              pada kode print dibawah kurang "Tahun" setelah p1.umur
              hal ini menyebabkan perbedaan pada kode dan output
            */
            //System.out.println("Umur: " + p1.umur);
            System.out.println("Umur: " + p1.umur + " Tahun");
        }
    
}
