/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
/**
 *
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Tyhmyystesti
 * 
 */
public class Testi6 {
    static Scanner lukija = new Scanner(System.in);
     
    public Testi6() {
    }

    public void aloita() {
        testi();
    }

    private char tyhmyystesti(int i) {
        char vastaus;
        char valinta = 'e';
        switch (i) {
            case 1:
                System.out.println(i + ". Valitse Tämä.");
                System.out.println("a: tämä");
                System.out.println("b: Tämä.");
                System.out.println("c: Tämä.");
                System.out.println("d: Valitse");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'o';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 2:
                System.out.println(i + ". ((11×2)/23-7+54)/3-2=5");
                System.out.println("a: 12");
                System.out.println("b: 22");
                System.out.println("c: 3");
                System.out.println("d: 6");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'o';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 3:
                System.out.println(i + ". Valitse ensimmäisen kysymyksen perusteella");
                System.out.println("a: Tämä.");
                System.out.println("b: No, ei nyt tämä ainakaan");
                System.out.println("c: Mitä odotit?");
                System.out.println("d: Ei tämä nyt niin vaikee valinta ole");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'o';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 4:
                System.out.println(i + ". Aiotko vastata tähän väärin?");
                System.out.println("a: En!");
                System.out.println("b: En tod");
                System.out.println("c: Kyllä");
                System.out.println("d: En tietenkään...");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'o';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 5:
                System.out.println(i + ". Montako reikää T-paidassa on, jos siinä on reikä?");
                System.out.println("a: 4");
                System.out.println("b: 5");
                System.out.println("c: 1");
                System.out.println("d: 6");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'o';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 6:
                System.out.println(i + ". Mkiläi yärmämrt tmään kkesyysymn niin vtasile veneiimin vahtithoeo");
                System.out.println("a: ?");
                System.out.println("b: ?");
                System.out.println("c: ?");
                System.out.println("d: ?");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'o';
                }
                return valinta;
            case 7:
                System.out.println(i + ". Marin isällä on viisi tytärtä: Nana, Nene, Nini, Nono. Mikä on viidennen nimi?");
                System.out.println("a: Nunu");
                System.out.println("b: Nena");
                System.out.println("c: Mari");
                System.out.println("d: Mara");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'o';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 8:
                System.out.println(i + ". Mikä liikkuu neljällä raajalla?");
                System.out.println("a: Kissa");
                System.out.println("b: Koira");
                System.out.println("c: Kilpikonna");
                System.out.println("d: Insinööriopiskelija");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'o';
                }
                return valinta;
            case 9:
                System.out.println(i + ". Mitä teet, kun sinulle sanotaan “Älä koske”");
                System.out.println("a: Kosket");
                System.out.println("b: Kosketat, kun kukaan ei nää");
                System.out.println("c: Irvistät, kun toinen kääntyy pois");
                System.out.println("d: Teet kuten sanotaan");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'o';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 10:
                System.out.println(i + ". Kumpi Ja Kampi Tappelivat. Kumpi Voitti?");
                System.out.println("a: En tiedä");
                System.out.println("b: Molemmat");
                System.out.println("c: Kampi");
                System.out.println("d: Helppoa, Kumpi");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'o';
                }
                return valinta;
            case 11:
                System.out.println(i + ". Mitä mieltä olet tästä testistä?");
                System.out.println("a: Aivan mahtava!");
                System.out.println("b: Ihan ok");
                System.out.println("c: Blääh!");
                System.out.println("d: Milloin tää kidustus loppuu?");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'o';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'v';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            case 12:
                System.out.println(i + ". Cheesy!");
                System.out.println("a: Dee!");
                System.out.println("b: D?");
                System.out.println("c: D!");
                System.out.println("d: d");
                System.out.print("Syöte: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        valinta = 'v';
                        break;
                    case 'b':
                        valinta = 'v';
                        break;
                    case 'c':
                        valinta = 'o';
                        break;
                    case 'd':
                        valinta = 'v';
                }
                return valinta;
            default:
                return valinta;
        }
    }

    public void testi() {
        int tulos = 0;
        char vastaus;
        System.out.println("Testaa tyhmyytesi");
        for (int i = 1;i<13;i++) {
            do {
                vastaus = tyhmyystesti(i);
            } while (vastaus == 'e');
            switch (vastaus) {
                case 'o':
                    tulos = tulos+1;
                    break;
                case 'v':
                    tulos = tulos+0;
            }
        }
        if (tulos < 5) {
            System.out.println("Et taida olla fiksuimmasta päästä. Kokeile uudestaan");
            System.out.println("Pisteitä sait 0-4/12p");
        } else if (tulos < 9) {
            System.out.println("Olet keskiverto ihminen. Tyydytkö oikeasti tähän?");
            System.out.println("Pisteitä sait 5-8/12p");
        } else if (tulos < 12) {
            System.out.println("Olet viisaampi kuin miltä näytät. Täydellinen et kuitenkaan.");
            System.out.println("Pisteitä sait 9-11/12p");
        } else if (tulos < 13) {
            System.out.println("Sait täydet pisteet! Kuinka monta yritystä meni tähänkin saavutukseen?");
        }
    }
}

