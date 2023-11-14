package OperDarteBis;

public class Scultura extends OperaArte {
    private double lunghezza;
    private double larghezza;
    private double profondita;
    public Scultura(String artista, String titolo, double lunghezza, double larghezza, double profondita){
        super(titolo, artista);
        this.larghezza=larghezza;
        this.lunghezza=lunghezza;
        this.profondita=profondita;
    }

    @Override
    public double printIngombro() {
        return profondita*larghezza*lunghezza;
    }

    @Override
    public String toString() {
        return "ARTISTA: "+ artista + " TITOLO: " + titolo +
                " LUNGHEZZA: " + lunghezza +
                " LARGHEZZA: " + larghezza + " PROFONDITA': "+ profondita;
    }
}
