package liste;
import com.sun.deploy.perf.PerfRollup;
import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import studente.Persona;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        /*
        ArrayList<String> lista = new ArrayList<>();
        lista.add("ciao");

        try{
            lista.add(1, "bella");
            System.out.println("GG");
        }catch (Exception e){
            System.out.println("posizione errata");
        }
        System.out.println(lista.toString());

        if(lista.remove("bwlla")){
            System.out.println("Rimosso con successo");
        }else {
            System.out.println("Non rimosso");
        }
        System.out.println(lista.toString());

        //verifica esistenza di un elemento all'interno
        System.out.println(lista.contains("bella"));

        //Numero di elementi
        System.out.println(lista.size());

        //indice dell'elemento e -1 se non viene trovato
        System.out.println(lista.indexOf("ciao"));

        //libera la lista
        //lista.clear();

        //verifica se l'array è vuoto
        System.out.println(lista.isEmpty());

        //ripulisce la memoria di questi elementi in più
        lista.trimToSize();

        //crea una un alias, quindi puntano allo stesso spazio (funzionano come gli array)
        ArrayList<String> lista1 = lista;

        //creo una copia ma solo con le classi wrapped se no lo devo sovrascrivere io
        ArrayList<String> lista2 = (ArrayList<String>) lista.clone();

        //per scorrere la lista
        for(String elemento:lista)
            System.out.println(elemento);

        //funziona uguale a quello sopra
        lista.forEach((ele)-> {
            System.out.println(ele);
        });
        //oppure normalmente che può essere utile per non scorrere tutta la lista
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        lista.add("UE");
        lista.add("Good");

        //returna una nuova lista con tutti gli elementi all'interno del range
        System.out.println(lista.subList(1,3));

        //inserisco una lista all'interno dell'altra
        System.out.println(lista.addAll(lista));

        //controlla se c'è una lista all'interno dell'altra
        System.out.println(lista.containsAll(lista));

        System.out.println(lista.removeAll(lista));

        //prove
        Collection<? extends String> es = Collections.singleton("yo");
        lista.addAll(es);
        System.out.println(lista.toString());

        //tiene
        lista2.ensureCapacity(2);
    */
        //esercizio (obiettivo riordinare una lista con elementi non wrapped)

        try {
            Persona p1 = new Persona("Rossi","Samuel","GNFBLD72B29E012Y", "29/01/2006");
            Persona p2 = new Persona("Rizzonelli","Emiliano","GNFBLD72B29E112Y", "18/01/2006");
            Persona p3 = new Persona("Largher","Nicola","GNFBLD72B29E012Y", "11/01/2006");

            ArrayList<Persona> persone = new ArrayList<>();
            persone.add(p2);
            persone.add(p1);
            persone.add(p3);




            for(Persona p: persone){
                System.out.println(p.toString());
            }
            Collections.sort(persone);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}


