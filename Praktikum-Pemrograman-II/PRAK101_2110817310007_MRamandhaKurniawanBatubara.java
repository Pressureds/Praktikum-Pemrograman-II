package prak101_2110817310007_mramandhakurniawanbatubara;
import java.util.Scanner;

/**
 *
 * @author Ramandha
 */
public class PRAK101_2110817310007_MRamandhaKurniawanBatubara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Merupakan deklarasi variabel sesuai dengan tipe data
        String nama, tempatlhr, namabulan;
        int bulanlhr, tanggallhr, tahunlhr, tinggibdn;
        float beratbdn;
        Scanner identitas = new Scanner(System.in);
        //Perintah untuk menginput data
        System.out.print("Masukkan Nama Lengkap: ");
        nama = identitas.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        tempatlhr = identitas.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: "); 
        tanggallhr = identitas.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        bulanlhr = identitas.nextInt();
        //Kondisi switch case yang dimana dipakai untuk menentukan bulan
        switch (bulanlhr) {
            case 1:
            namabulan = "Januari";
            break;
            case 2:
            namabulan = "Februari";
            break;
            case 3:
            namabulan = "Maret";
            break;
            case 4:
            namabulan = "April";
            break;
            case 5:
            namabulan = "Mei";
            break;
            case 6:
            namabulan = "Juni";
            break;
            case 7:
            namabulan = "Juli";
            break;
            case 8:
            namabulan = "Agustus";
            break;
            case 9:
            namabulan = "September";
            break;
            case 10:
            namabulan = "Oktober";
            break;
            case 11:
            namabulan = "November";
            break;
            default:
            namabulan = "Desember";
            break;
            }
        
        System.out.print("Masukkan Tahun Lahir: ");
        tahunlhr = identitas.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        tinggibdn = identitas.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        beratbdn = identitas.nextFloat();
 
        System.out.println("Data Telah Ditambahkan, ");
        System.out.println("Nama Lengkap " +nama+", Lahir di "+tempatlhr+" pada Tanggal "
                +tanggallhr+" "+namabulan+" "+tahunlhr+" Tinggi Badan "+tinggibdn+
                " cm dan Berat Badan "+beratbdn+" kilogram");

    }
    
}
