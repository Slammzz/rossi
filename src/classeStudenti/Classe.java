package classeStudenti;

import java.util.Arrays;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capoClasse, Studente[] studenti){
        this.capoClasse= new Studente(capoClasse);
        this.studenti = new Studente[studenti.length];
        this.studenti=studenti.clone();
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public Studente[] getStudenti() {
        return studenti;
    }

    public void setStudenti(Studente[] studenti) {
        this.studenti = studenti;
    }

    public void InvertiAttributi()throws Exception{
        try{
            for(int i = 0; i < studenti.length; i++){
                studenti[i]=new Studente(studenti[i].getNome(), studenti[i].getCognome());
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Classe{" +
                "capoClasse=" + capoClasse +
                ", studenti=" + Arrays.toString(studenti) +
                '}';
    }
}
