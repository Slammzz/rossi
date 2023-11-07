package poligoniRegolari;

public class TestPoligoniRegolari {
    public static void main(String[] args) {
        GestionePoligoni g1 = new GestionePoligoni(6);

        //PoligonoRegolare pol1 = new PoligonoRegolare();
        Quadrato q1 = new Quadrato(7);
        Rombo r1 = new Rombo(5, 11,9);
        Pentagono p1 = new Pentagono(2);
        Esagono e1 = new Esagono(23);
        g1.inserisciPoligono(q1);g1.inserisciPoligono(q1);
        g1.inserisciPoligono(r1);
        g1.inserisciPoligono(p1);
        g1.inserisciPoligono(e1);
        System.out.println(g1.toString());
        System.out.println(r1.disegno('x'));
        System.out.println(q1.disegno('x'));
        System.out.println(e1.disegno('x'));
    }

}
