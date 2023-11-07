package poligoniRegolari;
import java.lang.Math;

public class Quadrato extends PoligonoRegolare{
    public Quadrato(float lLati){
        super(4,lLati);
    }
    public Quadrato(Quadrato q){
        super(4,q.getLLati());
    }
    public float area(){
        return (getLLati()+getLLati());
    }
    public float diagonale(){
        return (float) Math.sqrt(Math.pow((double) getLLati(),2)+Math.pow((double)getLLati(),2));
    }
    public float apotema(){
        return getLLati()/2;
    }
    public String toString(){
        return "Rombo con lunghezza lati: "+getLLati();
    }
}
