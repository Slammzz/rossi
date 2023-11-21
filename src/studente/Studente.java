package studente;

public class Studente extends Persona implements Cloneable {


    public Studente(String cognome, String nome, String codFisc, String dataDiNascita)throws Exception{
        super(cognome,nome,codFisc,dataDiNascita);

    }




    private boolean stringaValida(String s)throws Exception{
        try {
            String[] nomi = s.split(" ");
            if (nomi.length == 0) {
                throw new Exception(" String vuota");
            }
            int i;
            for (i = 0; i < nomi.length; i++) {
                if ((int) nomi[i].charAt(0) < 65 || (int) nomi[i].charAt(0) > 90) {
                    throw new Exception("Maiuscola non presente ");
                }
                for (int j = 1; j < nomi[i].length(); j++) {
                    if ((int) nomi[i].charAt(j) < 97 || (int) nomi[i].charAt(j) > 122) {
                        throw new Exception("non si possono utilizzare caratteri speciali");
                    }
                    if((int) nomi[i].charAt(j) == 32 && (int) nomi[i].charAt(j+1) == 32){
                        throw new Exception("non si possono utilizzare caratteri speciali");
                    }
                }


            }/*
            for(int j=0; j<s.length();j++){
                if((int)s.charAt(j)<97||(int)s.charAt(j)>122){
                    throw new Exception("Non si possono utilizzare caratteri speciali");
                }
            }*/
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("c'è un errore nella scrittura dei dati");
        }catch (NullPointerException e){
            throw new NullPointerException("L'attributo non può essere nullo ");
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

