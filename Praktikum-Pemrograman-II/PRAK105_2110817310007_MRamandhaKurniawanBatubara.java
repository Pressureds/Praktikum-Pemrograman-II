package prak105_2110817310007_mramandhakurniawanbatubara;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PRAK105_2110817310007_MRamandhaKurniawanBatubara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner mhngtbung = new Scanner(System.in);
         float t, r, volumetabung;
         final float phi =3.14f;
         
         System.out.print("Masukkan jari-jari: ");
         r= mhngtbung.nextFloat();
         System.out.print("Masukkan tinggi: ");
         t= mhngtbung.nextFloat();
         
         volumetabung = phi * r * r * t;
         System.out.println(" Volume tabung dengan jari-jari" +r+ " cm dan tinggi " +t+ " cm adalah " +volumetabung+ " m3");
        
    }
    
}
