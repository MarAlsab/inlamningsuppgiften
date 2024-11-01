package Meningar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mening text = new Mening();
        String line;

        System.out.println("Skriv in text! (Skriv 'stop' för att avsluta.)");

        do {
            line = scan.nextLine();

            if (!line.equals("stop")) {
                text.addMening(line);
                System.out.println("Du skrev: " + line);
            }

        } while (!line.equals("stop"));

        System.out.println("Antal meningar: " + text.getAntalMeningar());
        System.out.println("Antal tecken (exklusive 'stop'): " + text.getAntalTecken());
    }
}


