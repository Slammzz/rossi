package poligoniRegolari;
import java.lang.Math;

public class Pentagono extends PoligonoRegolare{
    public Pentagono(float lLati){
        super(5,lLati);
    }
    public Pentagono(Pentagono p){
        super(5, p.getLLati());
    }
    public float area(){
        return (float) (Math.pow((double)super.getLLati(), 2) * 1.72);
    }
    public float diagonale(){
        return (float) ((super.getLLati()*(Math.sqrt(5) + 1))/2);
    }
    public float apotema(){
        return (float) (super.getLLati() * 0.688);
    }
    public String toString(){
        return "Pentagono con lunghezza lati: "+getLLati();
    }
}
