package model;
import java.util.Scanner;

public class Testi9 {
    static Scanner lukija = new Scanner (System.in);
    public Testi9() {    
    }
    
    public void aloita() {
        testi();   
    }
    
    private char Kysymys(int i) {
        char  vastaus;
        char hedelma = 'e';
        switch (i) {
            case 1:
                System.out.println("Millainen on huumorintajusi?");
                System.out.println("a.	Kiltti, sillä on tärkeintä, että jokaiselle jaa vitsistä hyvä mieli.");
                System.out.println("b.	Minua pidetään joskus aika vakavana, mutta osaan myös yllättää hulvattomilla vitseilläni.");
                System.out.println("c.	Sarkastinen, joten kaikki eivät aina ymmärrä huumoriani.");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 2:
                System.out.println("Minne matkustaisit mieluiten?");
                System.out.println("a.	Aasiaan reppureissailemaan.");
                System.out.println("b.	Espanjaan rantalomalle.");
                System.out.println("c.	New Yorkiin kaupunkilomalle.");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 3:
                System.out.println("Mikä on lempijuhlasi?");
                System.out.println("a.  Joulu");
                System.out.println("b.  Syntymäpäiväni");
                System.out.println("c   Uusivuosi");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 4:
                System.out.println("Mikä on lempieläimesi?");
                System.out.println("a.	Pehmeät ja pörröiset kissanpennut.");
                System.out.println("b.	Eksoottiset villieläimet.");
                System.out.println("c.	Ne jotka pysyvät minusta kaukana.");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 5:
                System.out.println("Millaisiin vaatteisiin pukeudut?");
                System.out.println("a.	Käytännöllisiin ja mukaviin vaatteisiin.");
                System.out.println("b.	Perus tylsänvärisiin paitaan ja alaosaan. Pukeutuminen ei niin kiinnosta minua.");
                System.out.println("c.	Seuraan viimeisimpiä muotivillityksiä ja pyrin noudattamaan niitä.");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 6:
                System.out.println("Millainen olet uusien ihmisten seurassa?");
                System.out.println("a.	Olen avoin ja iloinen ihminen ja tulen nopeasti kaikkien kanssa toimeen.");
                System.out.println("b.	Olen hitaasti lämpenevä ja näytän todellisen luonteeni vain todellisille ystävilleni.");
                System.out.println("c.	Riippuu mielialastani. Joskus uusien ihmisten tapaaminen on mahtavaa, joskus näytän hapanta naamaa.");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 7:
                System.out.println("Mikä on suosikki pizza täytteesi?");
                System.out.println("a.  Oliivit");
                System.out.println("b.  Pepperoni");
                System.out.println("c.  Mozzarella");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 8:
                System.out.println("Mitä hymiötä käytät eniten?");
                System.out.println("a.  <3");
                System.out.println("b.  :)");
                System.out.println("c.  : O");
                System.out.println("Vastaus: ");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            case 9:
                System.out.println("Millaista säätä suosit eniten?");
                System.out.println("a.	Lämmintä ja aurinkoista ulkoilusäätä.");
                System.out.println("b.	Viileää syksyistä pouta säätä.");
                System.out.println("c.	Kylmää ja lumista säätä jolloin voi pysytellä sisätiloissa.");
                vastaus = lukija.next().charAt(0);
                switch (vastaus) {
                    case 'a':
                        hedelma = 'B';
                        break;
                    case 'b':
                        hedelma = 'O';
                        break;
                    case 'c':
                        hedelma = 'G';  
                }
                return hedelma;
            default:
                return hedelma;
            }
        }
    
    public void testi() {
        char[] vastaukset = new char [9];
        int[] tulokset = new int [3];
        char vastaus;
        String tulos = "";
        System.out.println("Mikä hedelmä olet? Testaa tällä testillä!");
        for (int i = 1;i<10;i++) {
            do {
                vastaus = Kysymys(i);
            }
            while (vastaus == 'e');
            switch (vastaus) {
                case 'B':
                    tulokset[0] = tulokset[0]+1;
                    break;
                case 'O':
                    tulokset[1] = tulokset[1]+1;
                    break;
                case 'G':
                    tulokset[2] = tulokset[2]+1;
            }
        
        }
        int max = tulokset[0];
        int maxind = 0;
        for (int j = tulokset[0];j<tulokset.length;j++) {
            if (tulokset[j]>max) {
                max = tulokset[j];
                maxind = j;
            }
        }
        switch (maxind) {
            case 0:
                System.out.println("Olet BANAANI! Olet iloinen tosiystävä tyyppiä ja aina mukana siellä missä tapahtuu ja missä tarvitaan räiskyvää energiaa!");
                break;
            case 1:
                System.out.println("Olet OMENA! Olet omenaisen pyöreä. Olet kysyttyä lounasseuraa. Joskus olet hieman hapan, mutta useimmiten kuitenkin lempeä");
                break;
            case 2:
                System.out.println("Olet GREIPPI! Olet luonteeltasi iloinen, mutta joskus myös kirpeän pureva. Kuoresi on kova, mutta sisältä olet todellinen pehmo.");
        }
    }
}
    
