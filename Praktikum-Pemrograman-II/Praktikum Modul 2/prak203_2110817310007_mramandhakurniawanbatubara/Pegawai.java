package prak203_2110817310007_mramandhakurniawanbatubara;

/**
 *
 * @author ASUS
 */

/*nama class yang ditetapkan tidak sesuai atau berbeda dengan nama file yang berada di package yaitu Pegawai.java
  permasalahan ini sebenarnya bisa diatasi dengan mengganti nama file di package menjadi Employee.java 
  atau bisa juga dengan menghapus modifier publik sehingga menjadi class Employee {
*/
//public class Employee {
public class Pegawai {
    public String nama;
    
    /*Terjadi error disini karena tipe data yang digunakan salah, 
      seharusnya menggunakan String karena tipe data char hanya dapat diisi
      oleh 1 karakter saja
    */
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }

    /*terjadi error disini karena method setter yang dipanggil dibawah tidak memiliki parameter 
      maka harus ditambahkan terlebih dahulu agar kode dapat berjalan dengan baik dan
      variabel lokal j yang berada didalam setter tidak dideklarasikan
    */
    //public void setJabatan() {
    //    this.jabatan = j;
    //}
    public void setJabatan(String j){
        this.jabatan = j;
    }
}
