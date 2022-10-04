package prak103_2110817310007_mramandhakurniawanbatubara;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PRAK103_2110817310007_MRamandhaKurniawanBatubara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner peruwhiledo = new Scanner(System.in);
        int f = 0;
        int bilangan = peruwhiledo.nextInt();

        do{
            if(bilangan % 7 == 0){
                continue;
            }
            if(f == 5)
                System.out.print(bilangan);
            else
                System.out.print(bilangan + ", ");
            f++;
            bilangan--;
       
        } while(f<=4);
    }
}