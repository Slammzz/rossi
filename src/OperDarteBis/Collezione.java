package OperDarteBis;

public class Collezione {
    private String nome;
    private String luogo;
    private OperaArte[] opere;
    private int dimLog;

    public Collezione(String nome, String luogo, int lung){
        this.luogo=luogo;
        opere = new OperaArte[lung];
        dimLog = 0;
    }

    public void inserisci(OperaArte o){
        opere[dimLog]=o;
        dimLog++;
    }

    public String stampaCollezzione() {
        String s = "||| COLLEZIONE |||\n";
        for (int i = 0; i<dimLog; i++){
            s+=opere[i].toString()+"\n";
        }
        return s;

    }

    public String stampaIngombro(int i){
        return "L'ingombro è: "+opere[i].printIngombro();
    }
}
