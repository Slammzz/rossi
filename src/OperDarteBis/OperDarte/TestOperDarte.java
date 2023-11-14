package OperDarteBis.OperDarte;

public class TestOperDarte {
    public static void main(String[] args) {
        Quadro q1 = new Quadro("Michelangelo","Creazione di Adamo", 20.1, 12.2);
        Scultura s1 = new Scultura("Michelangelo", "David", 200, 120,30);
        Collezione c1 = new Collezione("Uffizzi", "Firenze",5);
        System.out.print(c1.stampaCollezzione());
        c1.inserisci(q1);
        c1.inserisci(s1);
        System.out.println(c1.stampaCollezzione());
        System.out.println(c1.stampaIngombro(0));
    }
}
