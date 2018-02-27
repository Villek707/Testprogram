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
 * Muumi-testi
 * 
 */
public class Testi3 {
    static Scanner lukija = new Scanner (System.in);
    public Testi3() {
    
    }
    
    public void aloita() {
        testi();
    }
    
    private char haeKysymys(int i) {
        char muumi = 'e';
        switch (i) {
            case 1:
                Kysymys kys1 = new Kysymys("Oletko...","Villi?","Rauhallinen?","-","-",i,'S','R','e','e');
                muumi = kys1.kysy();
                return muumi;
            case 2:
                Kysymys kys2 = new Kysymys("Oletko...","Myöntyvä?","Jääräpäinen","-","-",i,'R','S','e','e');
                muumi = kys2.kysy();
                return muumi;
            case 3:
                Kysymys kys3 = new Kysymys("Oletko herkkusuu?","Kyllä! Kaikki makea on hyvää.","En. Syön terveellisesti.","-","-",i,'S','R','e','e');
                muumi = kys3.kysy();
                return muumi;
            case 4:
                Kysymys kys4 = new Kysymys("Värikkäät vai mustavalkoiset vaatteet.","Värikkäät tietysti!","Mustavalkoiset.","-","-",i,'S','R','e','e');
                muumi = kys4.kysy();
                return muumi;
            case 5:
                Kysymys kys5 = new Kysymys("Kaverin kanssa vai yksin?","Yksin.","Ystävien kanssa","-","-",i,'S','R','e','e');
                muumi = kys5.kysy();
                return muumi;
            case 6:
                Kysymys kys6 = new Kysymys("Seikkailu vai turvallinen ympäristö?","Seikkailu!","Turvallinen.","-","-",i,'S','R','e','e');
                muumi = kys6.kysy();
                return muumi;
            case 7:
                Kysymys kys7 = new Kysymys("Kumpi ohjaa sinua?","Järki.","Tunteet","-","-",i,'R','S','e','e');
                muumi = kys7.kysy();
                return muumi;
            case 8:
                Kysymys kys8 = new Kysymys("Oletko pitkäjänteinen vai kärsimätön?","Pitkäjänteinen","Kärsimätön","-","-",i,'R','S','e','e');
                muumi = kys8.kysy();
                return muumi;
            case 9:
                Kysymys kys9 = new Kysymys("Oletko herkkä vai vahva?","Herkkä.","Vahva.","-","-",i,'R','S','e','e');
                muumi = kys9.kysy();
                return muumi;
            case 10:
                Kysymys kys10 = new Kysymys("Pidätkö vedestä ja uimisesta.","Joo.","En.","-","-",i,'S','R','e','e');
                muumi = kys10.kysy();
                return muumi;
            default:
                return muumi;
        }
    }
    public void testi() {
        int tulokset = 0;
        char vastaus;
        System.out.println("Tervetuloa Muumi-testiin. Tämä testi määrittää mikä Muumi-hahmo olet.");
        for (int i = 1;i<11;i++) {
            do {
                vastaus = haeKysymys(i);
            } while (vastaus == 'e');
            if (vastaus == 'S') {
                tulokset = tulokset+1;
            }
        }
        if (tulokset == 0) {
            System.out.println("Olet Hemuli! Rakastat rauhaa ja yksinoleskelua. ");
        }
        else if (tulokset < 4 & tulokset > 0) {
            System.out.println("Olet Nuuskamuikkunen! Olet mieluusti omissa oloissasi ja omassa rauhassa, mutta seikkailu kiinnostaa silloin tällöin.");
        }
        else if (tulokset < 8 & tulokset >= 4) {
            System.out.println("Olet Muumipappa! Olet usein omassa rauhassa, mutta silti kaipaat myös seikkailuja.");
        }
        else if (tulokset < 10 & tulokset >= 8) {
            System.out.println("Olet Muumipeikko! Tykkäät olla silloin tällöin omassa rauhassa, mutta kun seikkailuun tarjoutuu mahdollisuus tartut siihen heti.");
        }
        else {
            System.out.println("Olet Pikku Myy! Seikkailua ei ole koskaan liikaa!");
        }
    }
}
