
    package model;
    import java.util.*;
    import java.lang.*;
    import java.io.*;
     
    /**
    *
    * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
    *
    * Introvertti/ekstroverttitesti
    *
    */
    
    public class Testi5 {
        static Scanner lukija = new Scanner(System.in);
     
        public Testi5() {
        }
     
        public void aloita() {
            testi();
        }
     
        private char introvertti(int i) {
            char vastaus;
            char introvertti = 'e';
            switch (i) {
                case 1:
                    System.out.println("Viihdyn ja rentoudun saadessani olla omassa rauhassa.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 2:
                    System.out.println("Olen aivan uupunut monien ihmisten tapaamisen jälkeen, vaikka minulla olisi ollut hauskaakin. ");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 3:
                    System.out.println("Haluan työskennellä keskittyneesti mahdollisimman pitkiä jaksoja kerrallaan ilman keskeytyksiä.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 4:
                    System.out.println("Haluan ensin nähdä, miten muut toimivat, ennen kuin menen mukaan.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 5:
                    System.out.println("Tarvitsen paljon henkilökohtaista tilaa ja omaa aikaa, erityisesti oltuani sosiaalisessa tilanteessa.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 6:
                    System.out.println("Olen parempi kuuntelemaan kuin puhumaan.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 7:
                    System.out.println("Ihmiset pitävät minua hiljaisena ja syrjäytyväisenä.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 8:
                    System.out.println("Ajattelen ennen kuin puhun.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 9:
                    System.out.println("Huomaan usein yksityiskohtia, jotka muilta menevät ohi.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 10:
                    System.out.println("Olen luova ja/tai minulla on mielikuvitusta.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 11:
                    System.out.println("Vitkuttelen takaisin soittamista. Valitsen mieluummin tekstiviestin tai chat -viestittelyn puhelinsoiton sijasta.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 12:
                    System.out.println("Vitkuttelen takaisin soittamista. Valitsen mieluummin tekstiviestin tai chat -viestittelyn puhelinsoiton sijasta.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 13:
                    System.out.println("Muut ajattelevat, että olen fiksumpi kuin mitä itse koen olevani.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 14:
                    System.out.println("Olen kärsivällinen. En tylsisty yksin ollessani, vaan jaksan odottaa kauan, että jotain tapahtuisi.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                case 15:
                    System.out.println("Joskus minulla on vaikeuksia ilmaista omia tarpeitani. Erityisesti silloin, kun omat tarpeeni ovat ristiriidassa muiden tarpeiden kanssa, saatan jättää omat tarpeeni huomioimatta.");
                    System.out.println("Vastaa, joko (k/e) ");
                    vastaus = lukija.next().charAt(0);
                    switch (vastaus) {
                        case 'k':
                            introvertti = 'k';
                            break;
                        case 'e':
                            introvertti = 'e';
                    }
                    return introvertti;
                default:
                    return introvertti;
            }
        }
        public void testi() {
            char[] vastaukset = new char [15];
            int[] tulokset = new int [2];
            char vastaus;
            String tulos = "";
            System.out.println("Testaa oletko introvertti vai ekstrovertti!");
            for (int i = 1;i<16;i++) {
                do {
                    vastaus = introvertti(i);
                }
                while (vastaus == 'e');
                switch (vastaus) {
                    case 'k':
                        tulokset[0] = tulokset[0]+1;
                        break;
                    case 'e':
                        tulokset[1] = tulokset[1]+1;
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
                    System.out.print("Sinä olet introvertti, saat voimaa pohdiskelusta ja päätöksistä sekä kiinnität huomiota siihen, miten ulkoisen ympäristön muutokset vaikuttavat omaan itseesi. Pidät enemmän syvällisistä keskusteluista pienessä piirissä kuin hulinasta väentungoksessa. Ajattelet ennen kuin puhut, etkä tee hätiköityjä johtopäätöksiä. Keskittyy sisäiseen kokemukseen, ajatteluun, ideoihin ja tunteisiin. Haluat mieluummin ajatella itse ja mieluiten omassa rauhassa.");
                    break;
                case 1:
                    System.out.print("Olet ekstrovertti, saat energiaa ympäristöstäsi. Olet avoin, tunnet paljon ihmisiä ja sinun on helppo ryhtyä puheisiin vieraiden kanssa. Ääneen puhuminen auttaa ajattelua ja asioiden sekä ideoiden hahmottamista. Kaipaat fyysisiä tai henkisiä haasteita, esimerkiksi julkisuutta, huomiota, seuraa, uusia elämyksiä ja uusia asioita. Kiinnität huomiota siihen, millainen vaikutus itselläsi on ulkoiseen maailmaan.");
            }
        }
    }
