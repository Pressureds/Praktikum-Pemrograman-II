
package praktikum5.soal1;

/**
 *
 * @author ASUS
 */
public class Paint {

  //Enkapsulasi dari deklarasi properti
  //cangkupan daerah yang tertutupi
  private double coverage; 
 
  //Constructor untuk paint dan digunakan untuk menginisiasi dan memberikan nilai kepada properti 
  //dibatasi dengan parameter (isinya variabel lokal)
  public Paint(double c) 
  {
    coverage = c;
  } 
  //--------------------------------------------------- 
  //Returns the amount of paint (number of gallons) 
  //needed to paint the shape given as the parameter. 
  //--------------------------------------------------- 
  //method untuk menghitung dan memanggil amount
  public double amount(Shape s) 
  {
    System.out.println ("Computing amount for " + s);
    return s.area() / coverage;
  } 
}
