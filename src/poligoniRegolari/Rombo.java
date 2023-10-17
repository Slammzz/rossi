package poligoniRegolari;

public class Rombo extends PoligonoRegolare{
    private float dMin;
    private float dMag;
    public Rombo(float lLati, float dMag, float dMin){
        super(4,lLati);
        this.dMag=dMag;
        this.dMin=dMin;
    }
    public Rombo(Rombo r){
        super(4,r.getLLati());
    }
    public float area(){
        return (dMin*dMag)/2;
    }
    public float apotema(){
        return (area()*2)/super.perimetro();
    }
    public float getDMin(){
        return dMin;
    }
    public float getDMag(){
        return dMag;
    }
}
