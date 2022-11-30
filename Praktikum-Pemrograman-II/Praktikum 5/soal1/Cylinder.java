
package praktikum5.soal1;

/**
 *
 * @author ASUS
 */
public class Cylinder extends Shape 
{
  //Enkapsulasi properti
  private double radius;  
  private double height;  
  
  //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
  //dibatasi dengan parameter (isinya variabel lokal)
  public Cylinder(double r, double h) 
  {
    //untuk refer cylinder
    super("Cylinder"); 
    radius = r;
    height = h;
  } 
  
  //method menghitung area cylinder
  //dan mengembalikannya
  public double area() 
  {
    return Math.PI*radius*radius*height;
  }

  //Mengembalikan ke string
  public String toString() 
  {
    return super.toString() + " of radius " + radius + " and height " + height;
  }
}