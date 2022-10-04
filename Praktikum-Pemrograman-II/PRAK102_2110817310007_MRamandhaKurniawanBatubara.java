package prak102_2110817310007_mramandhakurniawanbatubara;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PRAK102_2110817310007_MRamandhaKurniawanBatubara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner peruwhile = new Scanner(System.in);
    int f = 0;
    //digunakan untuk menginputkan data
    int angka = peruwhile.nextInt();
    //melakukan perulangan
    while (f <= 6){
        int g;
        //melakukan percabangan
        if (angka % 2 == 0){
            g = (angka / 2) -1;
            System.out.print(", " + g + " ");
        }else{
            System.out.print(angka);
        }
        angka++;
        f++;
        }
    }
}
    
    
