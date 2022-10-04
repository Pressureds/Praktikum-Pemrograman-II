package prak104_2110817310007_mramandhakurniawanbatubara;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PRAK104_2110817310007_MRamandhaKurniawanBatubara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Andi, AndiR1, AndiR2, AndiR3;
        int Budi, BudiR1, BudiR2, BudiR3;
        Andi = 0; Budi = 0;
        Scanner game = new Scanner(System.in);
        //Kartu Andi tiap ronde
        System.out.print("Kartu Andi : ");
        AndiR1 = game.nextInt();
        AndiR2 = game.nextInt();
        AndiR3 = game.nextInt();
        //Kartu Budi tiap ronde
        System.out.print("Kartu Budi : ");
        BudiR1 = game.nextInt();
        BudiR2 = game.nextInt();
        BudiR3 = game.nextInt();
        //Percabangan mengenai score Andi dan Budi
        //Ronde 1
            if (AndiR1 > BudiR1) {
            Andi = Andi + 1;
            } else if(AndiR1 == BudiR1) {

            } else {
            Budi = Budi + 1;
            }
        //Ronde 2
            if (AndiR2 > BudiR2) {
            Andi = Andi + 1;
            } else if(AndiR2 == BudiR2) {

            } else {
            Budi = Budi + 1;
            }
        //Ronde 3
            if (AndiR3 > BudiR3) {
            Andi = Andi + 1;
            } else if(AndiR3 == BudiR3) {

            } else {
            Budi = Budi + 1;
            }
        //Output
            if (Andi > Budi){
                System.out.println("Andi");
            } else if (Andi == Budi){
                System.out.println("Seri");
            }
            else {
                System.out.println("Budi");
        }
    }
}
