
package model;
import java.util.Scanner;

/**
 * 
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Horoskooppitesti
 * 
 */
public class Testi4
{    static Scanner lukija = new Scanner(System.in);

    public void aloita() {

        int a;
        int kk;
        int pv;
        
        System.out.print("Syötä syntymävuotesi: ");
        a = lukija.nextInt();

        System.out.print("Syötä syntymäkuukautesi: ");
        kk = lukija.nextInt();

        System.out.print("Syötä syntymäpäiväsi: ");
        pv = lukija.nextInt();
        
        System.out.println(lansimainen(kk,pv));
        System.out.println(mayalainen(kk,pv));
        System.out.println("Olet kiinalaisessa horoskoopissa "+kiinalainen(a));
        System.out.print("Huom. Mikäli olet syntynyt 1.1-26.2 välillä kiinalainen horroskooppisi on vuotta aiempi eläin");

    }

    public String lansimainen(int kk, int pv) {

        switch (kk) {
            case 1:
                if (pv < 20) {
                    return "Olet länsimaisessa horoskoopissa kauris. Elementti: maa, Planeetta: Saturnus";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa vesimies. Elementti: ilma, Planeetta: Uranus";
                }
                break;
            case 2:
                if (pv < 20) {
                    return "Olet länsimaisessa horoskoopissa vesimies. Elementti: ilma, Planeetta: Uranus";
                } else if (pv < 30) {
                    return "Olet länsimaisessa horoskoopissa kalat. Elementti: vesi, Planeetta: Neptunus";
                }
                break;
            case 3:
                if (pv < 21) {
                    return "Olet länsimaisessa horoskoopissa kalat. Elementti: vesi, Planeetta: Neptunus";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa oinas. Elementti: tuli, Planeetta: Mars";
                }
                break;
            case 4:
                if (pv < 21) {
                    return "Olet länsimaisessa horoskoopissa oinas. Elementti: tuli, Planeetta: Mars";
                } else if (pv < 31) {
                    return "Olet länsimaisessa horoskoopissa härkä. Elementti: maa, Planeetta: Venus";
                }
                break;
            case 5:
                if (pv < 21) {
                    return "Olet länsimaisessa horoskoopissa härkä. Elementti: maa, Planeetta: Venus";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa kaksoset. Elementti: ilma, Planeetta: Merkurius";
                }
                break;
            case 6:
                if (pv < 22) {
                    return "Olet länsimaisessa horoskoopissa kaksoset. Elementti: ilma, Planeetta: Merkurius";
                } else if (pv < 31) {
                    return "Olet länsimaisessa horoskoopissa rapu. Elementti: vesi, Planeetta: Kuu";
                }
                break;
            case 7:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa rapu. Elementti: vesi, Planeetta: Kuu";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa leijona. Elementti: tuli, Planeetta: Aurinko";
                }
                break;
            case 8:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa leijona. Elementti: tuli, Planeetta: Aurinko";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa neitsyt. Elementti: maa, Planeetta: Merkurius";
                }
                break;
            case 9:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa neitsyt. Elementti: maa, Planeetta: Merkurius";
                } else if (pv < 31) {
                    return "Olet länsimaisessa horoskoopissa vaaka. Elementti: ilma, Planeetta: Venus";
                }
                break;
            case 10:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa vaaka. Elementti: ilma, Planeetta: Venus";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa skorpioni. Elementti: vesi, Planeetta: Pluto";
                }
                break;
            case 11:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa skorpioni. Elementti: vesi, Planeetta: Pluto";
                } else if (pv < 31) {
                    return "Olet länsimaisessa horoskoopissa jousimies. Elementti: tuli, Planeetta: Jupiter";
                }
                break;
            case 12:
                if (pv < 23) {
                    return "Olet länsimaisessa horoskoopissa jousimies. Elementti: tuli, Planeetta: Jupiter";
                } else if (pv < 32) {
                    return "Olet länsimaisessa horoskoopissa kauris. Elementti: maa, Planeetta: Saturnus";
                }
                break;
            default: 
                return "Virheellinen tieto";
        }
        return "Virheellinen tieto";
    }
    
    public String mayalainen(int kk, int pv) {

        switch (kk) {
            case 1:
                if (pv < 2) {
                    return "Olet Mayojen Haab -horoskoopissa Mol. Tarkoittaa: vettä, jaguaaria, pilvien kerääjää, valmistautumista.";
                } else if (pv < 22) {
                    return "Olet Mayojen Haab -horoskoopissa Ch'en. Tarkoittaa: mustaa taivasta ja myrskyä, kuuta, leikkokukkia, läntistä ilmansuuntaa.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Yax. Tarkoittaa: vihreää myrskyä, Venusta, kukkakimppua, etelän ilmansuuntaa.";
                }
                break;
            case 2:
                if (pv < 11) {
                    return "Olet Mayojen Haab -horoskoopissa Yax. Tarkoittaa: vihreää myrskyä, Venusta, kukkakimppua, etelän ilmansuuntaa.";
                } else if (pv < 30) {
                    return "Olet Mayojen Haab -horoskoopissa Sak. Tarkoittaa: valkoista myrskyä, sammakkoa, kukkivaa puuta, pohjoista ilmansuuntaa.";
                }
                break;
            case 3:
                if (pv < 3) {
                    return "Olet Mayojen Haab -horoskoopissa Sak. Tarkoittaa: valkoista myrskyä, sammakkoa, kukkivaa puuta, pohjoista ilmansuuntaa.";
                } else if (pv < 23) {
                    return "Olet Mayojen Haab -horoskoopissa Keh. Tarkoittaa: punaista myrskyä, puita, itäistä ilmansuuntaa.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Mak. Tarkoittaa: jumalallista numeroa kolme, suljettua kantta.";
                }
                break;
            case 4:
                if (pv < 12) {
                    return "Olet Mayojen Haab -horoskoopissa Mak. Tarkoittaa: jumalallista numeroa kolme, suljettua kantta.";
                } else if (pv < 31) {
                    return "Olet Mayojen Haab -horoskoopissa K'ank'in. Tarkoittaa: maa äitiä, koiraa, keltaista, alista maailmaa keltaista aurinkoa.";
                }
                break;
            case 5:
                if (pv < 2) {
                    return "Olet Mayojen Haab -horoskoopissa K'ank'in. Tarkoittaa: maa äitiä, koiraa, keltaista, alista maailmaa keltaista aurinkoa.";
                } else if (pv < 22) {
                    return "Olet Mayojen Haab -horoskoopissa Muwan. Tarkoittaa: pöllöä, tulta, Jumalan sadetta ja pilviä.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Pax. Tarkoittaa: istutusaikaa, puumaa, nuolta, rumpua.";
                }
                break;
            case 6:
                if (pv < 11) {
                    return "Olet Mayojen Haab -horoskoopissa Pax. Tarkoittaa: istutusaikaa, puumaa, nuolta, rumpua.";
                } else if (pv < 31) {
                    return "Olet Mayojen Haab -horoskoopissa Keyab. Tarkoittaa: kilpikonnaa, kuun jumalatarta, ykseyttä.";
                }
                break;
            case 7:
                if (pv < 21) {
                    return "Olet Mayojen Haab -horoskoopissa Kumk'n. Tarkoittaa: krokotiiliä, maissinpalkoa, viljaa, pimeyden herroja, sateen ja kasvien jumaluutta.";
                } else if (pv < 26) {
                    return "Olet Mayojen Haab -horoskoopissa Wayeb. Tarkoittaa: pahoja päiviä, maan jumaluutta, peikkoa.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Pop. Tarkoittaa: jaguaaria, päällikköä, johtajuutta, vehreitä ruohomaita.";
                }
                break;
            case 8:
                if (pv < 15) {
                    return "Olet Mayojen Haab -horoskoopissa Pop. Tarkoittaa: jaguaaria, päällikköä, johtajuutta, vehreitä ruohomaita.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Wo. Tarkoittaa: mustaa taivasta, mustaa jaguaaria, yötä, sammakkoa, suomaata.";
                }
                break;
            case 9:
                if (pv < 4) {
                    return "Olet Mayojen Haab -horoskoopissa Wo. Tarkoittaa: mustaa taivasta, mustaa jaguaaria, yötä, sammakkoa, suomaata.";
                } else if (pv < 24) {
                    return "Olet Mayojen Haab -horoskoopissa Sip. Tarkoittaa: leimautumista, kunniaa, verisidettä, myrskyä.";
                } else if (pv < 31) {
                    return "Olet Mayojen Haab -horoskoopissa Zotz. Tarkoittaa: lepakkoa, kalastusta, sammalta, talven alkua.";
                }
                break;
            case 10:
                if (pv < 14) {
                    return "Olet Mayojen Haab -horoskoopissa Zotz. Tarkoittaa: lepakkoa, kalastusta, sammalta, talven alkua.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Sek. Tarkoittaa: Taivasta ja Maata.";
                }
                break;
            case 11:
                if (pv < 3) {
                    return "Olet Mayojen Haab -horoskoopissa Sek. Tarkoittaa: Taivasta ja Maata.";
                } else if (pv < 23) {
                    return "Olet Mayojen Haab -horoskoopissa Xul. Tarkoittaa: koiranhäntää, koirajumalaa, henkeä joka ilmaisee itseään eläinten kautta.";
                } else if (pv < 31) {
                    return "Olet Mayojen Haab -horoskoopissa Yaxkin. Tarkoittaa: uutta aurinkoa, auringon jumaluutta, iltaruskoa, vehreyttä.";
                }
                break;
            case 12:
                if (pv < 13) {
                    return "Olet Mayojen Haab -horoskoopissa Yaxkin. Tarkoittaa: uutta aurinkoa, auringon jumaluutta, iltaruskoa, vehreyttä.";
                } else if (pv < 32) {
                    return "Olet Mayojen Haab -horoskoopissa Mol. Tarkoittaa: vettä, jaguaaria, pilvien kerääjää, valmistautumista.";
                }
                break;
            default:
                return "Virheellinen tieto";
        }
        return "Virheellinen tieto";
    }
    
    public String kiinalainen(int a) {
        String arvo;
        String[] zodiac = {"Apina", "Kukko", "Koira", "Sika", "Rotta", "Lehmä", "Tiikeri", "Kani", "Lohikäärme", "Käärme", "Hevonen", "Vuohi"};
        
        arvo = zodiac[a % 12];
        
        return arvo;
    }
}