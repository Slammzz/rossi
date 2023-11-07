package OperDarte;

import java.util.Arrays;

public class Collezione {
    private String nome;
    private String luogo;
    private OperaArte[] opere;
    private int dimLog;

    public Collezione(String nome, String luogo, int lung){
        this.luogo=luogo;
        this.opere=opere;
        opere = new OperaArte[lung];
        dimLog = 0;
    }

    public void inserisci(OperaArte o){
        opere[dimLog]=o;
        dimLog++;
    }

    public String stampaCollezzione() {
        return "Collezione{" +
                "opere=" + Arrays.toString(opere) +
                '}';
    }

    public String stampaIngombro(int i){
        return "L'ingombro è: "+opere[i].printIngombro();
    }
}
