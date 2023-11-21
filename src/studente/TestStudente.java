package studente;

public class TestStudente {
    public static void main(String[] args) {
        try {
            Studente s1 = new Studente("Rossi","Samuel","RSSMRC95M16H224T","29/01/2006");
            Studente s2 = new Studente("Rizzonelli","Emiliano","RSSMRC95M16H224T","24/07/2006");
            System.out.println(s1.toString());
            System.out.println(s2.toString());
            Studente clone1 = (Studente) s1.clone();
            s1.setCognome("Bianchi");
            System.out.println(s1.toString());
            System.out.println("clone: " + clone1.toString());
            System.out.println(s2.toString());
            System.out.println("Hashcode primo oggetto: "+s1.hashCode());
            if(s2.equals(s2)){
                System.out.println("Hai inserito due volte lo stesso studente");
            }else{
                System.out.println("sbagliato");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }catch (Throwable t){
            System.out.println(t.getMessage());
        }


    }
}
