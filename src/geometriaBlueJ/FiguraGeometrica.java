package geometriaBlueJ;

public abstract class FiguraGeometrica implements PoligonoRegolare {
    private String colore;

    public FiguraGeometrica(String c){
        setColore(c);
    }


    public void setColore(String colore) {
        this.colore = colore;
    }
    public String getColore(){
        return colore;
    }
}
