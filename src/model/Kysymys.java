/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Scanner;

/**
 *
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Kysymys-olion luokka
 * 
 * Tätä luokkaa käytetään luomaan Kysymys-olioita testeissä 1, 2 ja 3.
 */
public class Kysymys {
    static Scanner lukija = new Scanner(System.in);
    private String kysymys, vaihtoehtoA, vaihtoehtoB, vaihtoehtoC, vaihtoehtoD;
    private int kysymysnumero;
    private char vastausA, vastausB, vastausC, vastausD;
    
    public Kysymys (String kysymys, String a, String b, String c, String d, int i, char vastausa, char vastausb, char vastausc, char vastausd) {
        this.kysymys = kysymys;
        this.vaihtoehtoA = a;
        this.vaihtoehtoB = b;
        this.vaihtoehtoC = c;
        this.vaihtoehtoD = d;
        this.vastausA = vastausa;
        this.vastausB = vastausb;
        this.vastausC = vastausc;
        this.vastausD = vastausd;
        this.kysymysnumero = i;
    }
    
    public char kysy () {
        System.out.println("Kysymys "+kysymysnumero+". "+kysymys);
        System.out.println("a: "+vaihtoehtoA);
        System.out.println("b: "+vaihtoehtoB);
        System.out.println("c: "+vaihtoehtoC);
        System.out.println("d: "+vaihtoehtoD);
        System.out.print("Syöte: ");
        char syöte = lukija.next().charAt(0);
        char vastaus = 'e';
                switch (syöte) {
            case 'a':
                vastaus = vastausA;
                return vastaus;
            case 'b':
                vastaus = vastausB;
                return vastaus;
            case 'c':
                vastaus = vastausC;
                return vastaus;
            case 'd':
                vastaus = vastausD;
                return vastaus; 
                }
        return vastaus;
    }
}
