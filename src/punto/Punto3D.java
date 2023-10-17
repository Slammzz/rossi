package punto;
import puntoSegmento.Punto;

public class Punto3D extends Punto{
    private float z;

    public Punto3D(float x, float y, float z){
        super(x,y);
        this.z=z;
    }

    public Punto3D(Punto3D p){
        super(p.getX(),p.getY());
        z=p.z;
    }

    public String toString(){
        String punto="("+getX()+","+getY()+","+z+")";
        return punto;
    }

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z=z;
    }

    public void shift(float deltaX, float deltaY, float deltaZ){
        z+=deltaZ;
        shift(deltaX,deltaY);
    }

    /*
    public void prova(){
        super.aumento();
    }

     */
}

