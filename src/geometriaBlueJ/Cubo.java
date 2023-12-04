package geometriaBlueJ;

public class Cubo extends FiguraSolida{
    private double l;

    public Cubo(String c, double l)throws Exception{
        super(c);
        setLato(l);
    }


    public double calcolaSuperficie() {
        return 6 * Math.pow(l, 2);
    }
    public double calcolaVolume(){
        return l * l * l;
    }
    public double calcolaApotema() {
        return l * numFissQuad;
    }


    public double getLato() {
        return l;
    }
    public void setLato(double l) throws Exception{
        if(l <= 0){
            throw new Exception("Lato Invalido!");
        }
        this.l = l;
    }

    public String toString(){
        return "Lato: " + l + "Colore: " + getColore();
    }
}
