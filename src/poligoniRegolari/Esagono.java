package poligoniRegolari;

public class Esagono extends PoligonoRegolare{
    public Esagono(float lLati){
        super(6, lLati);
    }
    public Esagono(Esagono e){
        super(6, e.getLLati());
    }
    public float diagonale(){
        return getLLati();
    }
    public float area(){
        return(super.perimetro()*apotema())/2;
    }
    public float apotema(){
        return (float) (0.86*getLLati());
    }
}
