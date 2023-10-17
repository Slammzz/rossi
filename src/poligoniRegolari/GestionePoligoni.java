package poligoniRegolari;

import java.util.Arrays;

public class GestionePoligoni {
    private PoligonoRegolare[] arrPoligoni;
    private int dimLogica;

    public GestionePoligoni(int lunghezza) {
        arrPoligoni = new PoligonoRegolare[lunghezza];
        dimLogica = 0;
    }

    public void inserisciPoligono(PoligonoRegolare pol) {
        arrPoligoni[dimLogica] = pol;
        dimLogica++;
    }

    public PoligonoRegolare getLatoPiuLungo() {
        PoligonoRegolare max = arrPoligoni[0];
        for (int i = 1; i < dimLogica; i++) {
            if (arrPoligoni[i].getLLati() > max.getLLati()) {
                max = arrPoligoni[i];
            }
        }
        return max;
    }

        public String toString() {
            String s = "";
            for (int i = 0; i < dimLogica; i++) {
                s += arrPoligoni[i].toString();
            }
            return s;
        }
    }