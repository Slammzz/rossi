package poligoniRegolari;

public class PoligonoRegolare {
    private int nLati;
    private float lLati;

    public PoligonoRegolare(int nLati, float lLati){
        this.nLati=nLati;
        this.lLati=lLati;
    }
    public PoligonoRegolare(PoligonoRegolare p){
        nLati=p.nLati;
        lLati=p.lLati;
    }
    public int getNLati(){
        return nLati;
    }
    public void setNLati(int nLati){
        this.nLati=nLati;
    }
    public float getLLati(){
        return lLati;
    }
    public void setLLati(float lLati){
        this.lLati=lLati;
    }
    public String toString(){
        return "Numero lati: "+nLati+" lunghi: "+lLati;
    }
    public float perimetro(){
        return nLati*lLati;
    }
    /*
    public float area(){

    }

     */
}
