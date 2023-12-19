package geometriaBlueJ;

public class Sfera extends FiguraSolida{
    private double r;

    public Sfera(String c, double r)throws Exception{
        super(c);
        setRaggio(r);
    }

    public double calcolaVolume() {
        return Math.PI * Math.pow(r, 3) * 4/3;
    }
    public double calcolaSuperficie() {
        return Math.PI * Math.pow(r, 2) * 4;
    }
    public double calcolaApotema() {
        return (r * 2) * 0.289;
    }


    public double getR() {
        return r;
    }
    public void setRaggio(double r) throws Exception {
        if(r <= 0){
            throw new Exception("Raggio invalido!");
        }
        this.r = r;
    }

    public String toString(){
        return "Raggio: " + r + "Colore: " + getColore();
    }

}
