package mezzoDiTrasporto;

import java.util.ArrayList;
import studente.Persona;

public class Automobile extends MezzoDiTrasporto {
    private ArrayList<Persona> passeggeri;

    public Automobile(){

    }

    public Automobile(Integer cavalli, String marca){
        super.setCavalli(cavalli);
        super.setMarca(marca);
        passeggeri = new ArrayList<>();
    }


}
