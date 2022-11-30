
package praktikum5.soal1;
//mengimport class yang membantu performatan
import java.text.DecimalFormat;

/**
 *
 * @author ASUS
 */
public class PaintThings {
//-----------------------------------------
// Creates some shapes and a Paint object
// and prints the amount of paint needed
// to paint each shape.
//-----------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        Rectangle deck; 
        Sphere bigBall; 
        Cylinder tank; 
        double deckAmt, ballAmt, tankAmt;
        //Instantiate the three shapes to paint
         deck=new Rectangle(20, 30);
         bigBall=new Sphere(15);
         tank=new Cylinder(10, 30);
        //Compute the amount of paint needed for each shape
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        //Print the amount of paint for each. 
        //memanggil outputan dari jumlah cat yang dibutuhan setelah dihitung
        DecimalFormat fmt = new DecimalFormat("0.#"); 
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt)); 
        System.out.println ("Big Ball " + fmt.format(ballAmt)); 
        System.out.println ("Tank " + fmt.format(tankAmt));
  } 
}
    