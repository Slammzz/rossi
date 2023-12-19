package geometriaBlueJ;

public abstract class FiguraSolida extends FiguraGeometrica{
    public FiguraSolida(String colore) {
        super(colore);
    }
    abstract public double calcolaVolume();
    abstract public double calcolaSuperficie();
}
