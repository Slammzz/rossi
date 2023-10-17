package puntoSegmento;

public class TestSegmento {
    public static void main(String[] args){
        Punto p1 = new Punto(3,0);
        System.out.println("primo punto: " + p1.toString() );
        Punto p2 = new Punto(3,4);
        System.out.println("secondo punto: " + p2.toString() );
        //p1.traslaPunto(-3,0);
        System.out.println("punto traslato: " + p1.toString() );
        Segmento s1 = new Segmento(p1,p2);
        System.out.println("segmento: " + s1.toString());

        double distanza=0;
        try{
            distanza = s1.calcolaLunghezza();
            System.out.println(distanza);
            s1.traslaSegmento(4,5);
            System.out.println("dopo traslazione segmento\n");
            System.out.println("punto 1: " + p1.toString() );
            System.out.println("punto 2: " + p2.toString() );
            System.out.println("segmento: " + s1.toString());
            System.out.println("dopo traslazione punto 1\n");
            p1.shift(-4,12);
            System.out.println("punto 1: " + p1.toString() );
            System.out.println("punto 2: " + p2.toString() );
            System.out.println("segmento: " + s1.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
