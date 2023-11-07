package poligoniRegolari;
import java.lang.Math;

public class Quadrato extends PoligonoRegolare {
    public Quadrato(float lLati) {
        super(4, lLati);
    }

    public Quadrato(Quadrato q) {
        super(4, q.getLLati());
    }

    public float area() {
        return (getLLati() + getLLati());
    }

    public float diagonale() {
        return (float) Math.sqrt(Math.pow((double) getLLati(), 2) + Math.pow((double) getLLati(), 2));
    }

    public float apotema() {
        return getLLati() / 2;
    }

    public String toString() {
        return "Rombo con lunghezza lati: " + getLLati();
    }

    public String disegno(char s) {
        String disegno = "";
        for (int i = 0; i < getLLati(); i++) {
            if (i == 0 || i == getLLati()-1) {
                for (int j = 0; j < getLLati(); j++) {
                    disegno += s + " ";
                }
                disegno += "\n";
            } else {
                disegno += s+" ";
                for (int r = 0; r < getLLati() - 2; r++) {
                    disegno = disegno + "  ";
                }
                disegno = disegno + s + "\n";

            }


        }
        return disegno;
    }
}
