package punto;
import puntoSegmento.Punto;

public class PuntoColorato extends Punto{
    private String colore;

    public PuntoColorato(float x, float y, String colore){
        super(x,y);
        this.colore=colore;
    }

    public PuntoColorato(PuntoColorato p){
        super(p.getX(),p.getY());
        this.colore=p.colore;
    }

    public String toString(){
        String punto=super.toString()+" è di colore: "+colore;
        return punto;
    }

    public String getColore(){
        return colore;
    }

    public void setColore(String colore){
        this.colore=colore;
    }
}
