package poligoniRegolari;

public class TestPoligoniRegolari {
    public static void main(String[] args) {
        GestionePoligoni g1 = new GestionePoligoni(3);

        Quadrato q1 = new Quadrato(3);
        Rombo r1 = new Rombo(5, 11,9);
        Pentagono p1 = new Pentagono(2);
        Esagono e1 = new Esagono(23);
        g1.inserisciPoligono(q1);
        System.out.println(g1.toString());
    }

}
