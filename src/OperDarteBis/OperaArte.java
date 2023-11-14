package OperDarteBis;

public abstract class OperaArte {
    protected String titolo;
    protected String artista;

    public OperaArte(String titolo, String artista){
        this.titolo=titolo;
        this.artista=artista;
    }

    public abstract double printIngombro();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public abstract String toString();
}
