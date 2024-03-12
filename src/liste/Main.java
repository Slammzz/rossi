package liste;
import sun.rmi.runtime.NewThreadAction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
    }
}

