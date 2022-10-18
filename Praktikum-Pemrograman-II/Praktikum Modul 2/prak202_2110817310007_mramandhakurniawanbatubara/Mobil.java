package prak202_2110817310007_mramandhakurniawanbatubara;

/**
 *
 * @author ASUS
 */
////Deklarasi properti/atribut yang diperlukan pada class
public class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    private String pemilik;

    //Setter dan Getter Enkapsulasi properti/atribut
    public void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    public String getPemilik(){
        return this.pemilik;
    }
    public String getPajak(){
        //Menggunakan String.format "%,d" untuk menjadikan nilai keluaran bernilai integer dengan koma 
        return String.format("%,d", (this.harga)*2/100);
    }
    
    //Method untuk menampilkan properti/atribut
    public void info(){
        System.out.println("Merek Mobil : "+this.merek);
        System.out.println("Harga : RP. "+String.format("%,d", this.harga));
        System.out.println("Tahun Keluaran : " + tahun_keluaran);
        System.out.println("Kapasitas : "+this.kapasitas+"cc");
    }
}
