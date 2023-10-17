package punto;
import puntoSegmento.Punto;

public class TestPunto {
    public static void main(String[] args) {
        Punto p1 = new Punto(3,0);

        Punto3D punto3D = new Punto3D(3, 2,3);
        System.out.println("Il punto 3D è: "+punto3D.toString());
        punto3D.shift(2,2,2);
        System.out.println("Il punto 3D traslato è: "+punto3D.toString());
        punto3D.setZ(20);
        System.out.println("la z del punto è: "+punto3D.getZ());
        System.out.println("la y del punto è: "+punto3D.getY()+"\n");

        PuntoColorato puntoColorato = new PuntoColorato(2,3,"bianco");
        System.out.println(puntoColorato.toString());
        puntoColorato.setColore("verde");
        System.out.println("Il colore è: "+ puntoColorato.getColore());
        System.out.println("la y del punto è: "+puntoColorato.getY());
    }
}
