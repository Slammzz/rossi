package correzionePrimaVerifica;

public class TestRossi {
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("Rossi Samuel", "Samuel Rossi ", "RSSMRC95M16H224T","29/01/2006");
            System.out.println(p1.toString());
            Persona p2 = new Persona("Edoardo", "Varesco", "RSZMRC95M16H224W","04/10/2006");
            System.out.println(p2.toString());
            boolean omonomia=p1.verificaOmonimia(p2);
            Persona p3 = new Persona("Edoardo", "Varesco", "RSZMRC95M16H224W","29/11/2006");
            System.out.println(p3.toString());
            System.out.print(p1.calcolaEta());
            System.out.print(p3.calcolaEta());
            if(omonomia){
                System.out.println("sono omonimi");
            }
            else {
                System.out.println("non sono omonimi");
            }
            Prenotazione pre1 = new Prenotazione(p2, "29/01/2226", "01:01:02","samuel.rossi@buonarroti.tn.it");
            System.out.println(pre1.toString());
        }catch (NullPointerException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
