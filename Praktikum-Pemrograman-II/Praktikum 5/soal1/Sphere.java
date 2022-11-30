
package praktikum5.soal1;

/**
 *
 * @author ASUS
 */
public class Sphere extends Shape 
{
  //Enkapsulasi properti
  private double radius;  
  //---------------------------------- 
  //Constructor: Sets up the sphere. 
  //---------------------------------
  //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
  //dibatasi dengan parameter (isinya variabel lokal)- 
  public Sphere(double r) 
  {
    //untuk refer sphere
    super("Sphere"); 
    radius = r;
  } 
  
  //method menghitung area sphere
  //dan mengembalikannya
  public double area() 
  {
    return 4*Math.PI*radius*radius;
  }
  
  //mengembalikan ke string
  public String toString() 
  {
    return super.toString() + " of radius " + radius;
  }
  
}