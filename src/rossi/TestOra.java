package rossi;

import ora.Ora;

import java.util.Scanner;

public class TestOra {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        int hours;
        int minutes;
        int seconds;
        int scelta;
        boolean o;
        o = false;
        System.out.print("inserire ora: ");
        hours = input.nextInt();
        System.out.print("inserire minuto: ");
        minutes = input.nextInt();
        System.out.print("inserire secondi: ");
        seconds = input.nextInt();
        Ora oggetto = new Ora(hours,minutes,seconds);
        while (o == false) {
            System.out.println(" ");
            System.out.println("Cosa vuoi fare? ");
            System.out.println("1) Aggiungere minuti; ");
            System.out.println("2) Aggiungere secondi; ");
            System.out.println("3) Aggiungere ore; ");
            System.out.println("4) Sapere quante ore sono passate da mezzanotte;");
            System.out.println("5) Sapere quanti minuti sono passate da mezzanotte;");
            System.out.println("6) Sapere quanti secondi sono passati da mezzanotte;");
            System.out.println("0) Se vuoi si vuole uscire dal programma.");
            System.out.print(": ");
            scelta = input.nextInt();
            while (scelta < 0 || scelta > 6) {
                System.out.println("La scelta deve essere compresa tra 0 e 6");
                scelta = input.nextInt();
            }
            switch (scelta) {
                case 0:
                    o = true;
                    System.out.println("Arrivederci");
                    break;

                case 1:
                    System.out.print("Inserire minuti da aggiungere: ");
                    int minutiDaAggiungere = input.nextInt();
                    oggetto.addMinutes(minutiDaAggiungere);
                    int h=oggetto.getH();
                    int m=oggetto.getM();
                    int s=oggetto.getS();
                    System.out.println("Ora l'orario è: "+ oggetto.toString());
                    break;

                case 2:
                    System.out.print("Inserire secondi da aggiungere: ");
                    int secondiDaAggiungere = input.nextInt();
                    oggetto.addSeconds(secondiDaAggiungere);
                    int ora=oggetto.getH();
                    int minuto=oggetto.getM();
                    int secondo=oggetto.getS();
                    System.out.println("Ora l'orario è: "+ oggetto.toString());
                    break;

                case 3:
                    System.out.print("Inserire ore da aggiungere: ");
                    int oreDaAggiungere = input.nextInt();
                    oggetto.addhours(oreDaAggiungere);
                    int ore=oggetto.getH();
                    int minuti=oggetto.getM();
                    int secondi=oggetto.getS();
                    System.out.println("Ora l'orario è: "+ oggetto.toString());
                    break;

                case 4:
                    int mezzanotteh = oggetto.hoursAfterMidnight();
                    System.out.println("Da mezzanotte sono passate: " + mezzanotteh + " ore");
                    break;

                case 5:
                    int mezzanottem = oggetto.minutesAfterMidnight();
                    System.out.println("Da mezzanotte sono passati: " + mezzanottem + " minuti");
                    break;

                case 6:
                    int mezzanottes = oggetto.secondsAfterMidnight();
                    System.out.println("Da mezzanotte sona passati: " + mezzanottes + " secondi");
                    break;
            }


        }
    }
}
