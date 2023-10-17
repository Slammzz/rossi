package classeStudenti;

public class TestClasse {
    public static void main(String[] args) {
        Studente s1=null;
        Studente s2=null;
        Studente s3=null;
        Studente s4=null;
        Studente s5=null;
        try {
            s1 = new Studente("Rossi Sam","Samuel Lhghjh");
            System.out.println(s1.toString());
            s2 = new Studente("Martini","Loris");
            System.out.println(s2.toString());
            s3 = new Studente("Carlin","Emanuele");
            System.out.println(s3.toString());
            s4 = new Studente("Ravagni","Pietro");
            System.out.println(s4.toString());
            s5 = new Studente("Rizzonelli","Emiliano");
            System.out.println(s5.toString());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
/*
        Studente[] listaStud = {s1,s2,s3,s4,s5};

        System.out.println("lista dopo assegnamento: "+listaStud.toString());
        Classe c1 = new Classe(s2,listaStud);
        System.out.println(c1.toString());
        try {
            c1.InvertiAttributi();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("lista dopo invertimento");
        System.out.println(c1.toString());
        System.out.println("studenti singolarmenti");
        System.out.println("primo studente");
        System.out.println(s1.toString());
        System.out.println("secondo studente");
        System.out.println(s2.toString());
        System.out.println("terzo studente");
        System.out.println(s3.toString());
        System.out.println("quarto studente");
        System.out.println(s4.toString());
        System.out.println("quinto studente");
        System.out.println(s5.toString());
*/
    }
}
