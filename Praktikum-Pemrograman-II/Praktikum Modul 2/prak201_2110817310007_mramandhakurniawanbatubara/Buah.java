package prak201_2110817310007_mramandhakurniawanbatubara;

/**
 *
 * @author ASUS
 */

//properti
public class Buah {
    private String namaJenis;
    private String warna;
    private String tekstur;
    private String rasa;
    private Double berat;
    private int jumlahBeli;
    private int harga;

    //Setter dan Getter Enkapsulasi properti/atribut
    public String getNamaBuah() {
        return namaJenis;
    }

    public void setNamaBuah(String namaJenis) {
        this.namaJenis = namaJenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTekstur() {
        return tekstur;
    }

    public void setTekstur(String tekstur) {
        this.tekstur = tekstur;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public Double getBerat() {
        return berat;
    }

    public void setBerat(Double berat) {
        this.berat = berat;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    //Construktor untuk menginisiasi dan memberikan nilai kepada properti 
    public Buah(String namaJenis, String warna, String tekstur, String rasa, Double berat, int jumlahBeli, int harga) {
        this.namaJenis = namaJenis;
        this.warna = warna;
        this.tekstur = tekstur;
        this.rasa = rasa;
        this.berat = berat;
        this.jumlahBeli = jumlahBeli;
        this.harga = harga;
    }

    //Method untuk menghitung total berat buah
    public Double totalBerat() {
        double total = berat *  jumlahBeli;
        return total;
    }

    //Method untuk menghitung total harga pembelian buah
    public int totalHarga () {
        int totalHarga = harga * jumlahBeli;
        return totalHarga;
    }

    //Method untuk menampilkan properti/atribut
    public void display() {
        System.out.println("Nama Mangga : " + namaJenis);
        System.out.println("Berat : " + berat + "kg");
        System.out.println("Jumlah Beli : " + jumlahBeli);
        System.out.println("Total berat : " + totalBerat() + " Kg");
        System.out.println("Total harga : Rp." + totalHarga());
        System.out.println();
    }
}


