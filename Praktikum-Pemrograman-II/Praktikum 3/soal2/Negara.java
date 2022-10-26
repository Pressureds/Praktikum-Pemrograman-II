package praktikum3.soal2;

/**
 *
 * @author ASUS
 */
public class Negara {
    //Enkapsulasi dari deklarasi properti
    private String nama_negara, jenis_kepemimpinan, nama_pemimpin;
    private int tanggal_kemerdekaan, bulan_kemerdekaan, tahun_kemerdekaan;

    //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
    //untuk jenis kepimpinannya selain monarki(ada kemerdekaan)
    //dibatasi dengan parameter (isinya variabel lokal)
    public Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin, int tanggal_kemerdekaan, int bulan_kemerdekaan, int tahun_kemerdekaan) {
        this.nama_negara = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
        this.bulan_kemerdekaan = bulan_kemerdekaan;
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }

    //Constructor untuk negara monarki
    public Negara(String nama, String jenis_kepemimpinan, String nama_pemimpin) {
        this.nama_negara = nama;
        this.jenis_kepemimpinan = jenis_kepemimpinan;
        this.nama_pemimpin = nama_pemimpin;
    }

    //Method untuk kapitalisasi huruf
    public String toTitleCase(String a) {
        StringBuilder titleCase = new StringBuilder(a.length());
        boolean nextTitleCase = true;
        //char untuk 1 karakter(disini digunakan karena hanya ingin kapitalisasi huruf depan)
        for (char c : a.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

    //Setter dan Getter Enkapsulasi properti/atribut
    public String getNama() {
        return nama_negara;
    }

    public void setNama(String nama) {
        this.nama_negara = nama;
    }

    public String getJenis_kepemimpinan() {
        return jenis_kepemimpinan;
    }

    public void setJenis_kepemimpinan(String jenis_kepemimpinan) {
        this.jenis_kepemimpinan = jenis_kepemimpinan;
    }

    public String getNama_pemimpin() {
        return nama_pemimpin;
    }

    public void setNama_pemimpin(String nama_pemimpin) {
        this.nama_pemimpin = nama_pemimpin;
    }

    public int getTanggal_kemerdekaan() {
        return tanggal_kemerdekaan;
    }

    public void setTanggal_kemerdekaan(int tanggal_kemerdekaan) {
        this.tanggal_kemerdekaan = tanggal_kemerdekaan;
    }

    public int getBulan_kemerdekaan() {
        return bulan_kemerdekaan;
    }

    public void setBulan_kemerdekaan(int bulan_kemerdekaan) {
        this.bulan_kemerdekaan = bulan_kemerdekaan;
    }

    public int getTahun_kemerdekaan() {
        return tahun_kemerdekaan;
    }

    public void setTahun_kemerdekaan(int tahun_kemerdekaan) {
        this.tahun_kemerdekaan = tahun_kemerdekaan;
    }
}
