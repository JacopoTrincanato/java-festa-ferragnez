package com.ferragnez.party;

//importo lo scanner
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {

        // creo l'array con il nome degli invitati
        String[] invitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // creo una variabile per contenere lo scanner
        Scanner scanner = new Scanner(System.in);

        // chiedo all'utente come si chiama
        System.out.println("Buonasera, come ti chiami?");
        String nomeInvitato = scanner.nextLine();

        // creo una variabile per verificare se l'invitato è presente
        boolean invitatoPresente = false;

        // uso il ciclo for nell'array per cercare il nome nella lista
        for (int i = 0; i < invitati.length; i++) {

            // // se il nome è presente nella lista, allora setto invitatoPresente su true
            if (invitati[i].equalsIgnoreCase(nomeInvitato)) {
                invitatoPresente = true;
                break;
            }

        }

        // se il nome è presente nella lista, allora lascio entrare l'invitato,
        // altrimenti no
        if (invitatoPresente) {
            System.out.println("Puoi entrare alla festa");
        } else {
            System.out.println("non puoi entrare alla festa. Non sei sulla lista degli invitati");
        }

        // chiudo lo scanner
        scanner.close();

    }
}
