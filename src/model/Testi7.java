package model;
import java.util.Scanner;
/**
 * 
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Psykopaattitesti
 * 
 */
public class Testi7 {
    static Scanner lukija = new Scanner (System.in);
    public Testi7(){
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
                System.out.println("Petytkö yleensä elokuvien loppuratkaisuihin?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                System.out.println("c.  kyllä, koska olen yleensä roistojen puolella");
                vastaus = lukija.next().charAt(0); 
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                        break;
                    case 'c':
                        luku = luku + 2;
                }
            case 2:
                System.out.println("Oletko hyvä valehtelija?");
                System.out.println("a.  Kyllä, ja valehtelenkin paljon");
                System.out.println("b.  Kyllä, mutta en halua pahaa valheillani");
                System.out.println("c.  En");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 2;
                        break;
                    case 'b':
                        luku = luku + 1;
                        break;
                    case 'c':
                        luku = luku + 0;
                }
            case 3:
                System.out.println("Kun kuulet ihmisten nauravan viereisessä pöydässä, pelkäätkö niiden toisinaan nauravan sinulle?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 0;
                        break;
                    case'b':
                        luku = luku + 1;
                }
            case 4: 
                System.out.println("Tunnetko syyllisyyttä, jos jätät roskan luontoon?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 0;
                        break;
                    case 'b':
                        luku = luku + 2;
                }
            case 5:
                System.out.println("Ymmärtävätkö muut ihmiset sinua?");
                System.out.println("a.  kyllä");
                System.out.println("b.  eivät");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 0;
                        break;
                    case 'b':
                        luku = luku + 2;
                }
            case 6:
                System.out.println("Oletko suunnitellut huolellisesti, kuinka voisit tappaa jonkun, vaikka sinulla ei olisi mitään aikomusta toteuttaa suunnitelmaasi?");
                System.out.println("a.  Kyllä");
                System.out.println("b.  En");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 3;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 7:
                System.out.println("Jos olisi täysin varmaa ettet jää kiinni ja että kaikki menisi suunnitellusti, voisitko tappaa jonkun henkilön, josta et pidä, jos saisit siitä 10 miljoonaa euroa?");
                System.out.println("a.  Voisin");
                System.out.println("b.  Erään tyypin kohdalla voisin, vaikka en saisi rahoja");
                System.out.println("c.  Voisin, mutta vain jos muutkin hyötyisivät siitä");
                System.out.println("d.  En");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 3;
                        break;
                    case 'b':
                        luku = luku + 4;
                        break;
                    case 'c':
                        luku = luku + 1;
                        break;
                    case 'd':
                        luku = luku + 0;
                }
            case 8:
                System.out.println("Pelkäävätkö muut ihmiset sinua?");
                System.out.println("a.  kyllä");
                System.out.println("b.  eivät");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 9:
                System.out.println("Käytätkä mielialasi parantamiseen säännöllisesti alkoholia tai lääkkeitä?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 10:
                System.out.println("Pidätkö itsestäsi?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 11:
                System.out.println("Hymyiletkö juuri nyt?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 0;
                        break;
                    case 'b':
                        luku = luku + 1;
                }
            case 12:
                System.out.println("Olisiko ydinsotaa hauska seurata televisiosta?");
                System.out.println("a.  kyllä");
                System.out.println("b.  ei");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 13:
                System.out.println("Toivotko, että jollekkin tuntemallesi ihmiselle tapahtuisi ikäviä asioita?");
                System.out.println("a.  kyllä");
                System.out.println("b.  en");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 1;
                        break;
                    case 'b':
                        luku = luku + 0;
                }
            case 14:
                System.out.println("Pelottaako sinua tämän testin tulos?");
                System.out.println("a.  Kyllä, koska pelkään olevani psykopaatti");
                System.out.println("b.  Kyllä");
                System.out.println("c.  Ei");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 0;
                        break;
                    case 'b':
                        luku = luku + 1;
                        break;
                    case 'c':
                        luku = luku + 2;
                }
            case 15:
                System.out.println("Oletko mies vai nainen?");
                System.out.println("a.  mies");
                System.out.println("b.  nainen");
                System.out.println("c.  wow, 2017");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        luku = luku + 2;
                        break;
                    case 'b':
                        luku = luku + 1;
                        break;
                    case 'c':
                        luku = luku + 0;
                }
        }
        return luku;
    }
 
    public void testi() {
        System.out.println("Selvitä tällä testillä oletko psykopaatti");
        int tulos = Kysymys(1);
 
        if(tulos >= 0 && tulos <= 10) {
            System.out.println("VASTAUS: Ei syytä huoleen, et luultavastikkaan ole psykopaatti.");
        }
        else if(tulos >= 11 && tulos <= 18) {
            System.out.println("VASTAUS: Aika rajoilla mennään, kannattaa alkaa miettimään elämän valintoja.");
        }
        else {
            System.out.println("VASTAUS: SOS, olet psykopaatti!");
        }
    }
}