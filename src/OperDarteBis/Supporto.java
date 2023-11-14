package OperDarteBis;

public class Supporto {
    private String materiale;
    private double profondita;
    private double lunghezza;
    private double larghezza;

    public Supporto(String materiale, double lunghezza, double larghezza, double profondita){
        this.larghezza=larghezza;
        this.lunghezza=lunghezza;
        this.profondita=profondita;
        this.materiale=materiale;
    }

    public String getMateriale() {
        return materiale;
    }

    public double getProfondita() {
        return profondita;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    @Override
    public String toString() {
        return "Supporto{" +
                "materiale='" + materiale + '\'' +
                ", profondita=" + profondita +
                ", lunghezza=" + lunghezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
