
package praktikum5.soal1;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape 
{
  //Enkapsulasi dari deklarasi properti
  private double length;  
  private double width;  
  
  //---------------------------------- 
  //Constructor: Sets up the rectangle. 
  //---------------------------------- 
  //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
  //dibatasi dengan parameter (isinya variabel lokal)
  public Rectangle(double l, double w) 
  {
      //untuk refer rectangle
    super("Rectangle"); 
    length = l;
    width = w;
  } 
  //method menghitung area rectangle
  //dan mengembalikannya
  public double area() 
  {
    return length * width;
  }
  //Mengembalikan ke string
  public String toString() 
  {
    return super.toString() + " of length " + length + " and width " + width;
  }
}