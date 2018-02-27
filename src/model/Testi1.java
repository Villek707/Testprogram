/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;
//import java.util.HashMap;
//import java.util.Map;

/**
 *
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Tupatesti
 * 
 */
public class Testi1 {
    static Scanner lukija = new Scanner (System.in);
    public Testi1() {

    }
    
    public void aloita() {
        testi();
    }
    
    private char haeKysymys(int i) {
        char tupa = 'e';
        switch (i) {
            case 1:
                Kysymys kys1 = new Kysymys("Teet kouluesitelmää ryhmässä, miten toimit...","Otat ohjat, organisoit kaiken ja päädyt loppujen lopuksi tekemään melkein kaiken.","Teet mahdollisimman vähän. Eli annat muiden tehdä kaiken.","Teet vähän kaikkea.","Teet suurimman osan kirjoittamisesta sekä tiedonhausta, mutta annat muiden tehdä siitä hienon ja tyylikkään.",i,'R','L','P','K');
                tupa = kys1.kysy();
                return tupa;
            case 2:
                Kysymys kys2 = new Kysymys("Lunttaatko tai huijaatko koulussa?","En missään tapauksessa.","Pyrin olemaan huijaamatta, mutta joskus se on ainoa tapa pysyä mukana opetuksessa.","Kyllä, melko paljon. Kaikkihan tekevät niin...","Kyllä, mikäli vastausten jakaminen sekä hädässä olevien ystävien auttaminen lasketaan.",i,'K','P','L','R');
                tupa = kys2.kysy();
                return tupa;
            case 3:
                Kysymys kys3 = new Kysymys("Kun kuolet, toivot, että...","Olet tarpeeksi varakas elättämään perheesi monien tulevien sukupolvien ajan.","Olet menestynyt ja maailmaa matkannut.","Olet monien elinikäisten ystävien ympäröimänä.","Tiedät kaiken mitä voi tietää.",i,'P','L','R','K');
                tupa = kys3.kysy();
                return tupa;
            case 4:
                Kysymys kys4 = new Kysymys("Näet joukon kiusaajia, kiusaamassa nörttiä. Sinä...","Menet kiusaajien luokse ja huudat heille.","Etsit kiusatun jälkikäteen ja autat häntä.","Sympatisoit nörtin kanssa, mutta kävelet ohi.","Ajattelet, että se on hieman hassua.",i,'R','P','K','L');
                tupa = kys4.kysy();
                return tupa;
            case 5:
                Kysymys kys5 = new Kysymys("Mikä näistä viihdealan ammateista kiinnostaa eniten?","Agentti","Käsikirjoittaja","Elokuvatähti","Viihdealan asianajaja",i,'R','K','L','P');
                tupa = kys5.kysy();
                return tupa;
            case 6:
                Kysymys kys6 = new Kysymys("Miten flirttailet?","Et flirttaile, kysyt vain suoraan, jos tykkäät jostakusta.","Yrität pitää hyvin syvällistä keskustelua.","Kerrot vitsejä ja hymyilet ujosti hurmataksesi heidät.","Kerrot kliseisiä iskurepliikkejä sekä isket silmää.",i,'R','K','P','L');
                tupa = kys6.kysy();
                return tupa;
            case 7:
                Kysymys kys7 = new Kysymys("Palaat kaupasta ja huomaat maksaneesi vähemmän, kuin sinun olisi tarvinnut. Sinä...","Palaat kauppaan maksamaan.","Et välitä, sillä se on niin pieni määrä rahaa.","Kerrot kaupalle ensi kerran, kun käyt siellä, jos enään koskaan käyt siellä...","Et voi uskoa onneasi.",i,'R','L','K','P');
                tupa = kys7.kysy();
                return tupa;
            case 8:
                Kysymys kys8 = new Kysymys("Ajatuksesi hyvästä kesälomasta on...","Hengailu ja kuulumisten vaihtelu kavereiden kanssa.","Laskuvarjoilu sekä kallioilta sukeltaminen.","Hyvän kirjan lukeminen omassa rauhassa.","Kesäkoulu",i,'R','L','P','K');
                tupa = kys8.kysy();
                return tupa;
            case 9:
                Kysymys kys9 = new Kysymys("Kuulet, että joku luokallasi on vaihtanu esseensä aiheen samaan, jota sinä olet työstänyt jo pitkän aikaa. Sinä...","Tapaat opettajan ja kerrot hänelle, että valitsit aiheen ensin.","Halveksit oppilasta kaukaa, mutta et sano mitään.","Et välitä, oma hyvä työsi puhuu puolestasi.","Puhut oppilaalle ja sanot ettei hän saa kopioida ideaasi.",i,'R','L','K','P');
                tupa = kys9.kysy();
                return tupa;
            case 10:
                Kysymys kys10 = new Kysymys("Kuinka saat aikaa yksin, kun tahdot sitä?","Kerrot kavereillesi, että tahdot olla yksin.","Perut tapaamiset kavereittesi kanssa.","Katoat pitkiksi ajoiksi sanaa sanomatta.","Teet kotitöitä tai lähdet ajelulle.",i,'K','L','R','P');
                tupa = kys10.kysy();
                return tupa;
            default:
                return tupa;
        }
    }
    public void testi() {
        int[] tulokset = new int[4];
        char vastaus;
        System.out.println("Tervetuloa tupatestiin. Tämä testi määrittää Harry Potter -tupasi.");
        for (int i = 1;i<11;i++) {
            do {
                vastaus = haeKysymys(i);
            } while (vastaus == 'e');
            switch (vastaus) {
                case 'R':
                    tulokset[0] = tulokset[0]+1;
                    break;
                case 'K':
                    tulokset[1] = tulokset[1]+1;
                    break;
                case 'P':
                    tulokset[2] = tulokset[2]+1;
                    break;
                case 'L':
                    tulokset[3] = tulokset[3]+1;
                    
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
                System.out.println("Olet Rohkelikko");
                break;
            case 1:
                System.out.println("Olet Korpinkynsi");
                break;
            case 2:
                System.out.println("Olet Puuskupuh");
                break;
            case 3:
                System.out.println("Olet Luihuinen");
        }     
    }
}
