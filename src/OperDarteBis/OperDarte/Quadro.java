package OperDarteBis.OperDarte;

public class Quadro extends OperaArte {
    private double lunghezza;
    private double larghezza;

    public Quadro(String artista, String titolo, double lunghezza, double larghezza){
        super(titolo, artista);
        this.larghezza=larghezza;
        this.lunghezza=lunghezza;
    }

    @Override
    public double printIngombro() {
        return lunghezza*larghezza;
    }

    @Override
    public String toString() {
        return  "ARTISTA: "+ artista + " TITOLO: " + titolo +
                " LUNGHEZZA: " + lunghezza +
                " LARGHEZZA: " + larghezza ;


    }
}
