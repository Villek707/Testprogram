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
 * Alkoholismitesti
 * 
 */
public class Testi2 {
    static Scanner lukija = new Scanner (System.in);
    public Testi2() {
    
    }
    
    public void aloita() {
        testi();
    }
    
    private char haeKysymys(int i) {
        char alkoholismi = 'e';
        switch (i) {
            case 1:
                Kysymys kys1 = new Kysymys("Milloin sinulla on viimeksi ollut hauskaa ilman viinaa?","Viimeisen kolmen päivän aikana.","Viimeisen viikon aikana.","Kolmen kuukauden aikana.","En muista. :(",i,'E','L','V','A');
                alkoholismi = kys1.kysy();
                return alkoholismi;
            case 2:
                Kysymys kys2 = new Kysymys("Onko viimeisen vuoden aikana mennyt muisti juodessa?","Kyllä.","Kyllä, mutta minulla menee tosi helposti.","Ei.","Ei, eikä ole koskaan mennyt.",i,'A','V','L','E');
                alkoholismi = kys2.kysy();
                return alkoholismi;
            case 3:
                Kysymys kys3 = new Kysymys("Olet menossa hauskaan tapahtumaan, jossa on tarjolla halpaa viinaa sekä siellä juodaan paljon. Tekeekö mieli vetää pohjia?","Ei ole houkutuksia vetää pohjia ennen tapahtumaa.","Tunnen innostusta päästä juomaan, mutta maltan aloittaa juomisen vasta muiden kanssa.","Juon muutenkin koko ajan, joten ihan sama.","Vedän kotona pohjia, mutta olen silloin jo tapahtumaan saapuvien ystävien kanssa sosiaalisessa mediassa, joten en juo yksin.",i,'E','L','A','V');
                alkoholismi = kys3.kysy();
                return alkoholismi;
            case 4:
                Kysymys kys4 = new Kysymys("Minkä mittainen on pisin jakso tänä vuonna, jolloin et ole ajatellut alkoholia?","Alle tunti.","Alle 24 tuntia.","Alle viikko.","Yli viikko.",i,'A','V','L','E');
                alkoholismi = kys4.kysy();
                return alkoholismi;
            case 5:
                Kysymys kys5 = new Kysymys("Palkitsetko itseäsi alkoholilla rasittavan työsuorituksen päätteeksi?","Kyllä, usein myös vahvoilla.","Toki, mutta vain miedoilla.","Jos nyt työviikon lopuksi.","En.",i,'A','V','L','E');
                alkoholismi = kys5.kysy();
                return alkoholismi;
            case 6:
                Kysymys kys6 = new Kysymys("Löydät kotoasi viinapullon, avaat korkin ja haistat sitä. Tekeekö mieli juoda?","Ei.","Kyllä, ainahan tekee.","Kyllä.","Kyllä, kerran kun löyty ja tulikin avattua...",i,'E','A','L','V');
                alkoholismi = kys6.kysy();
                return alkoholismi;
            case 7:
                Kysymys kys7 = new Kysymys("Onko testin aikana alkanut tehdä mieli viinaa?","Kyllä.","Ei.","Teki mieli jo ennen testiä.","Olen juonut tässä testiä tehdessä.",i,'L','E','V','A');
                alkoholismi = kys7.kysy();
                return alkoholismi;
            default:
                return alkoholismi;
        }
    }
    public void testi() {
        int tulokset = 0;
        char vastaus;
        System.out.println("Tervetuloa Alkoholismitestiin. Tämä testi määrittää alkoholiriippuvuutesi.");
        System.out.println("(Huom. Tämä ei ole psykologian tai muiden sellaisten tieteiden asiantuntijoiden suunnittelema testi, vaan insinööriopiskelijoiden. Pohdi tulosta omalla vastuulla.)");
        for (int i = 1;i<8;i++) {
            do {
                vastaus = haeKysymys(i);
            } while (vastaus == 'e');
            switch (vastaus) {
                case 'E':
                    tulokset = tulokset+0;
                    break;
                case 'L':
                    tulokset = tulokset+1;
                    break;
                case 'V':
                    tulokset = tulokset+2;
                    break;
                case 'A':
                    tulokset = tulokset+3;
                    break;
            }
        }
        if (tulokset < 7) {
            System.out.println("Onnea! Et ole Et ole yhtään riippuvainen alkoholista.");
        }
        else if (tulokset < 14 & tulokset >= 7) {
            System.out.println("Noh, tuleehan sitä silloin tällöin juotua. Olet vain lievästi alkoholiriippuvainen.");
        }
        else if (tulokset < 21 & tulokset >= 14) {
            System.out.println("Alkoholi taitaa olla aika iso osa elämääsi. Olet vahvasti alkoholiriippuvainen. K3!");
        }
        else {
            System.out.println("Olet alkoholisti. Onnea?");
        }
    }
}
