import java.util.Scanner;
/*
public class TestRaccolta {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        boolean o;
        o = false;
        int scelta;
        int durata;
        System.out.print("Inserire numero giorni periodo: ");
        durata = input.nextInt();

        Data d1 = null;
        RaccoltaMele m1 = new RaccoltaMele(durata);
        GiornataRaccolta m2 = null;

        while(o==false){
            System.out.println(" ");
            System.out.println("Cosa vuoi fare? ");
            System.out.println("1) Aggiungere giornata; ");
            System.out.println("2) Totale raccolto; ");
            System.out.println("3) Media giornaliera; ");
            System.out.println("4) Giornata con più quintali raccolti;");
            System.out.println("5) Date sopra soglia;");
            System.out.println("6) Quintali in data;");
            System.out.println("0) Se vuoi si vuole uscire dal programma.");
            System.out.print(": ");
            scelta = input.nextInt();
            while (scelta < 0 || scelta > 6) {
                System.out.println("La scelta deve essere compresa tra 0 e 6");
                scelta = input.nextInt();
            }
            switch (scelta){
                case 0:
                    o = true;
                    System.out.println("Arrivederci");
                    break;
                case 1:
                    System.out.println("Inserire giorno: ");
                    int giorno = input.nextInt();
                    System.out.println("Inserire mese: ");
                    int mese = input.nextInt();
                    System.out.println("Inserire anno: ");
                    int anno = input.nextInt();

                    d1 = new Data(giorno, mese, anno);

                    System.out.println("Inserire quintali: ");
                    double qq = input.nextDouble();

                    m2 = new GiornataRaccolta(qq);

                    System.out.println("Inserimento avvenuto con successo");
                    break;
                case 2:

            }
        }
    }
}
*/