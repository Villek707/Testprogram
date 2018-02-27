package model;
import java.util.Scanner;

/**
 * 
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Insinööriopiskelijatesti
 * 
 */


public class Testi8 {
    static Scanner lukija = new Scanner (System.in);
    public Testi8() {    
    }
 
    public void aloita() {
        testi();   
    }
 
    private int Kysymys(int i) {
        char  vastaus;
        char valinta = 'e';
        int luku = 0;
        switch (i) {
            case 1:
                System.out.println("1.	Mitä tarkoittaa ”Koodi3”?");
                System.out.println("a.	Kello kolmea, joka on yleinen iltavuoron alkamisaika.");
                System.out.println("b.	En todellakaan tiedä.");
                System.out.println("c.	Kehotus nopeaan siirtymiseen Bulevardin viereiseen kuppilaan nimeltä Boothill.");
                System.out.println("d.	Jotain tekemistä juomisen kanssa.");
                System.out.println("e.	Pitää nopeasti piiloutua metsään kiven tai puun taakse");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        //valinta = luku + 3; 
                        luku = luku +3;
                        break;
                    case 'b':
                        luku = luku +1;
                        break;
                    case 'c':
                        luku = luku +10;
                        break;
                    case 'd':
                        luku = luku +7;
                        break;
                    case 'e':
                        luku = luku +5;
                }
            case 2:
                System.out.println("2.	Mitä ostat yleensä Alkosta?");
                System.out.println("a.	Kohtuullisen hintaista viiniä");
                System.out.println("b.	Erikoisoluita");
                System.out.println("c.	Tonic vettä");
                System.out.println("d.	Jaloviinaa");
                System.out.println("e.	Makeaa likööriä");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku +7;
                        break;
                    case 'b':
                        luku = luku +5;
                        break;
                    case 'c':
                        luku = luku +1;
                        break;
                    case 'd': 
                        luku = luku +10;
                        break;
                    case 'e':
                        luku = luku +3;
                }
            case 3:
                System.out.println("3.	Millä Pääkaupunkiseudun toimipisteellä opiskelet?");
                System.out.println("a.	Tukholmankadulla");
                System.out.println("b.	Arabiassa");
                System.out.println("c.	Leppävaarassa");
                System.out.println("d.	Bulevardilla");
                System.out.println("e.	Albertinkadulla");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku +1;
                        break;
                    case 'b':
                        luku = luku +3;
                        break;
                    case 'c':
                        luku = luku +7;
                        break;
                    case 'd': 
                        luku = luku +10;
                        break;
                    case 'e':
                        luku = luku +5;
                }
            case 4:
                System.out.println("4.	Mikä on tursas?");
                System.out.println("a.	Keltanokka");
                System.out.println("b.	Mustekala");
                System.out.println("c.	Tekniikan alan fuksi");
                System.out.println("d.	Ensimmäisen vuoden opiskelija");
                System.out.println("e.	Näytelmä");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +1;
                        break;
                    case 'b':
                        luku = luku +3;
                        break;
                    case 'c':
                        luku = luku +7;
                        break;
                    case 'd': 
                        luku = luku +10;
                        break;
                    case 'e':
                        luku = luku +5;
                }
            case 5:
                System.out.println("5.	Mikä on imppulakki?");
                System.out.println("a.	Kahdeksankulmainen, mustalla silkkitupsulla varustettu violetti samettilakki.");
                System.out.println("b.	Värikäs lippalakki, jossa on myös propelli.");
                System.out.println("c.	Foliohatun toinen nimi.");
                System.out.println("d.	Sellainen liila ylioppilaslakin kopio.");
                System.out.println("e.	Pälvikalju. ");
                System.out.print("Vastaus: ");   
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +10;
                        break;
                    case 'b':
                        luku = luku +5;
                        break;
                    case 'c':
                        luku = luku +1;
                        break;
                    case 'd': 
                        luku = luku +7;
                        break;
                    case 'e':
                        luku = luku +3;
                }
            case 6: 
                System.out.println("6.	Kuinka kauan opintosi kestävät?");
                System.out.println("a.	4 vuotta");
                System.out.println("b.	3 vuotta");
                System.out.println("c.	5 vuotta");
                System.out.println("d.	Niin kauan, kunnes 240op on kasassa.");
                System.out.println("e.	Ai pitääkö joskus valmistuakin?");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +10;
                        break;
                    case 'b':
                        luku = luku +3;
                        break;
                    case 'c':
                        luku = luku +1;
                        break;
                    case 'd': 
                        luku = luku +7;
                        break;
                    case 'e':
                        luku = luku +5;
                }
            case 7: 
                System.out.println("7.	Mikä sinusta tulee, kun valmistut?");
                System.out.println("a.	Työtön alkoholisti");
                System.out.println("b.	Kokki");
                System.out.println("c.	Sairaanhoitaja");
                System.out.println("d.	Presidentti");
                System.out.println("e.	Insinööri");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +7;
                        break;
                    case 'b':
                        luku = luku +3;
                        break;
                    case 'c':
                        luku = luku +1;
                        break;
                    case 'd': 
                        luku = luku +5;
                        break;
                    case 'e':
                        luku = luku +10;
                }
            case 8:
                System.out.println("8.	Kuinka monena päivänä voi bilettää?");
                System.out.println("a.	Kerran viikossa, joko perjantaina tai lauantaina");
                System.out.println("b.	Ei kertaakaan jos on kouluviikko");
                System.out.println("c.	Pääpäivinä (t-kirjaimella alkavat, muista tänään!)");
                System.out.println("d.	Riippuu virallisten opiskelija bileitten määrästä");
                System.out.println("e.	2-4 kertaa");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +3;
                        break;
                    case 'b':
                        luku = luku +1;
                        break;
                    case 'c':
                        luku = luku +10;
                        break;
                    case 'd': 
                        luku = luku +5;
                        break;
                    case 'e':
                        luku = luku +7;
                }
            case 9:
                System.out.println("9.	Mikä on lempi asusi?");
                System.out.println("a.	Musta puku");
                System.out.println("b.	Labratakki");
                System.out.println("c.	Opiskelijahaalarini");
                System.out.println("d.	One Piece haalari");
                System.out.println("e.	kuljen mieluiten alasti");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +5;
                        break;
                    case 'b':
                        luku = luku +1;
                        break;
                    case 'c':
                        luku = luku +10;
                        break;
                    case 'd': 
                        luku = luku +3;
                        break;
                    case 'e':
                        luku = luku +7;
                    }
            case 10:
                System.out.println("10.	Mikä on lempi juhlasi?");
                System.out.println("a.	Joulu");
                System.out.println("b.	Uusivuosi");
                System.out.println("c.	Wappu");
                System.out.println("d.	Pääsiäinen");
                System.out.println("e.	Juhannus");
                System.out.print("Vastaus: ");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku +3;
                        break;
                    case 'b':
                        luku = luku +5;
                        break;
                    case 'c':
                        luku = luku +10;
                        break;
                    case 'd': 
                        luku = luku +1;
                        break;
                    case 'e':
                        luku = luku +7;
                }
 
        }
        return luku;
    }
    public void testi() { 
        System.out.println("Testaa kuinka insinööriopiskelija olet!");
        int tulos = Kysymys(1);
 
        if(tulos >= 0 && tulos <= 20){
            System.out.println("VASTAUS: Lol, ooks joku hoitsu muka?");
        }
        else if(tulos >= 21 && tulos <= 40){
            System.out.println("VASTAUS: Yritystä hei nyt pikkasen...1/5 (1 tuli säälistä) ");
        }
        else if(tulos >= 41 && tulos <= 60){
            System.out.println("VASTAUS: Vivahteita löytyy. Taidat alaa opiskella, mutta villi opiskelu puoli ei ole sinun juttusi?");
        }
        else if(tulos >= 61 && tulos <= 80){
            System.out.println("VASTAUS: Et aivan täydellinen insinööriopiskelija, mutta taitaa olla ehkä näin jopa parempi!");
        }
        else{
            System.out.println("VASTAUS: 6/5 No tätä enempää insinööriopiskelija voi ollakkaan! Kannattaisiko ehkä hieman rajoittaa..?");    
        }
    }
}