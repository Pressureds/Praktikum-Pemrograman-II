package praktikum3.soal1;

/**
 *
 * @author ASUS
 */
public class Dadu {
    //Enkapsulasi properti
    private int nilaidadu;

    //Method untuk mengacak nilai dadu 
    public int acakNilai() {
        //random() digunakan untuk mengacak nilai 
        return nilaidadu =  (int) (Math.random()*(6-1+1)+1);
    }

    //Getter untuk nilai dadu
    public int getNilai() { 
        return nilaidadu;
    }
}
