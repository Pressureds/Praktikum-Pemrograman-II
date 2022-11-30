
package praktikum5.soal1;

/**
 *
 * @author ASUS
 */
public abstract class Shape {
    //delarasi
    String shapeName;
  //---------------------------------- 
  //Constructor: Sets up the shape. 
  //----------------------------------
  //Constructor untuk menginisiasi dan memberikan nilai kepada properti 
  //dibatasi dengan parameter (isinya variabel lokal)
  public Shape(String name) {
    shapeName = name;
  }

  public abstract double area();

  //mengembalikan ke string
  public String toString() {
    return shapeName;
  }
}
