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
    public String toString(){
        return "Esagono con lunghezza lati: "+getLLati();
    }

    public String disegno(char s) {
        int lato = (int)getLLati();
        String riga="";
        for (int i = 0; i < lato; i++) {
            String spaziIniziali = "";
            String spaziInterni = "";

            for (int j = 0; j < lato / 2 - i; j++) {
                spaziIniziali += " ";
            }

            for (int j = 0; j < 2 * i; j++) {
                spaziInterni += " ";
            }

            riga = spaziIniziali + "x" + spaziInterni + "x";

        }
        return riga;
    }
}
