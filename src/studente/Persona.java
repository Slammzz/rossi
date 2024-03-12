package studente;

import java.time.ZoneId;
import java.time.LocalDate;
import java.util.Comparator;

public class Persona {
    private String cognome;
    private String nome;
    private String codFisc;
    private String dataDiNascita;
    protected static int  numeroIstanze;

    public Persona(){
        numeroIstanze++;
    }
    public Persona(String cognome, String  nome, String codFisc,String d)throws Exception{
        //this(); sbagliato usarlo perchè andrei ad aumentare 2 volte le istanze
        setCognome(cognome);
        setNome(nome);
        setCodFisc(codFisc);
        dataDiNascita=d;
        numeroIstanze++;
    }

    public Persona(correzionePrimaVerifica.Persona p)throws Exception{
        this();
        this.cognome=p.getCognome();
        this.nome=p.getNome();
        this.codFisc= p.getCodFisc();
        numeroIstanze++;
    }

    public void setCognome(String c)throws Exception {
        if(c.equals("") ){
            throw new NullPointerException("il cognome inserito è vuoto");
        }
        if(c == null){
            throw new Exception("il nome inserito è vuoto");
        }
        controlloNominativi(c);
        cognome=c.trim();

    }

    public void setNome(String n) throws Exception{
        if(n == null){
            throw new Exception("il nome inserito è vuoto");
        }

        if(n.equals("") ){
            throw new NullPointerException("il nome inserito è vuoto");
        }
        controlloNominativi(n);
        nome=n.trim();

    }

    public void setCodFisc(String codFisc) throws Exception {
        if(codFisc == null){
            throw new NullPointerException("il codice fiscale inserito è vuoto");
        }if(codFisc.equals("") ){
            throw new NullPointerException("il codice fiscale inserito è vuoto");
        }

        if(codFisc.matches("[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}")){
            this.codFisc = codFisc;
        }else{
            throw new Exception("il codice fiscale inserito è invalido");
        }
        this.codFisc = codFisc;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCodFisc() {
        return codFisc;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public int getNumeroIstanze() {
        return numeroIstanze;
    }

    public Integer  calcolaEta(){
        String[] tmp=dataDiNascita.split("/");
        LocalDate oggi = LocalDate.now(ZoneId.systemDefault());
        if(oggi.getMonthValue() > Integer.parseInt(tmp[1])){
            return oggi.getYear()-Integer.parseInt(tmp[2]);
        } else if (oggi.getMonthValue()==Integer.parseInt(tmp[1])) {
            if(oggi.getDayOfMonth() > Integer.parseInt(tmp[0])){
                return oggi.getYear()-Integer.parseInt(tmp[2]);
            }else {
                return oggi.getYear()-Integer.parseInt(tmp[2])-1;
            }
        }else{
            return oggi.getYear()-Integer.parseInt(tmp[2])-1;
        }


    }

    public boolean verificaOmonimia(correzionePrimaVerifica.Persona persona){
        if(persona.getNome().equals(nome) && persona.getCognome().equals(cognome)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "[" + cognome + ", " + nome +  ", " + codFisc + ", "+ dataDiNascita +']';
    }

    private void controlloNominativi(String nominativo) throws Exception {
        try {
            if (nominativo.equals(""))
                throw new Exception("L'attributo non può essere vuoto!");

            String[] testi = nominativo.split(" ");

            for (int i = 0; i < testi.length; i++) {
                // controllo del primo carattere maiuscolo
                if ((int) testi[i].charAt(0) < 65 || (int) testi[i].charAt(0) > 90) {
                    throw new Exception("L'attributo deve avere le iniziali maiuscole!");
                }

                // controllo dei successivi caratteri minuscoli
                for (int j = 1; j < testi[i].length(); j++) {
                    if ((int) testi[i].charAt(j) < 97 || (int) testi[i].charAt(j) > 122) {
                        throw new Exception("L'attributo non deve contenere caratteri speciali e solo le iniziali maiuscole!");
                    }
                }
            }

            nominativo = nominativo.trim();

        } catch (NullPointerException e){
            throw new NullPointerException ("L'attributo non può essere null");
        } catch (StringIndexOutOfBoundsException e) {
            throw new StringIndexOutOfBoundsException ("Non è consentito l'utilizzo di più di uno spazio!");
        }
    }

    /*
    public int CompareTo(Persona p){
        return Integer.compare(calcolaEta(), p.calcolaEta());
    }

     */

    public int compareTo(Persona altraPersona) {
        return this.dataDiNascita.compareTo(altraPersona.dataDiNascita);
    }
}

