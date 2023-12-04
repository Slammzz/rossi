package geometriaBlueJ;

public class TestGeometria {
    public static void main(String[] args) {
        try {
            Sfera s = new Sfera("bianco",12);
            Cubo c = new Cubo("verde", 10.1);
            System.out.println("Il volume del cubo è: "+c.calcolaVolume());
            System.out.print("Il volume della sfera è: "+ s.calcolaVolume());
        }catch (Exception e){
            System.out.print(e.getMessage());
        }


    }
}
