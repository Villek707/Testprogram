/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.Scanner;
import model.Testi1;
import model.Testi2;
import model.Testi3;
import model.Testi4;
import model.Testi5;
import model.Testi6;
import model.Testi7;
import model.Testi8;
import model.Testi9;

/**
 *
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Tämä luokka on MVC:n C eli Controller (ohjain). Ohjain luokka on vastuussa
 * testien eli model-tason luokkien ja olioiden kutsumisesta. Luokka siis hallitsee ohjelmaa pääasiassa.
 * 
 * Ohjain luokan olio luodaan View luonnissa ja käynnistyksessä.
 * Ohjaimen luonti puolestaan luo yhden olion jokaisesta testi luokasta,
 * jotta niitä voidaan hyödyntää.
 * 
 */
public class Controller {
    static Scanner lukija = new Scanner(System.in);
    private Testi1 testi1;
    private Testi2 testi2;
    private Testi3 testi3;
    private Testi4 testi4;
    private Testi5 testi5;
    private Testi6 testi6;
    private Testi7 testi7;
    private Testi8 testi8;
    private Testi9 testi9;
    
    public Controller() {
        testi1 = new Testi1();
        testi2 = new Testi2();
        testi3 = new Testi3();
        testi4 = new Testi4();
        testi5 = new Testi5();
        testi6 = new Testi6();
        testi7 = new Testi7();
        testi8 = new Testi8();
        testi9 = new Testi9();

    }
    
    public void tulkitse (int syöttö) {
        switch (syöttö) {
            case 1:
                testi1.aloita();
                break;
            case 2:
                testi2.aloita();
                break;
            case 3:
                testi3.aloita();
                break;
            case 4:
                testi4.aloita();
                break;
            case 5:
                testi5.aloita();
                break;
            case 6:
                testi6.aloita();
                break;
            case 7:
                testi7.aloita();
                break;
            case 8:
                testi8.aloita();
                break;
            case 9:
                testi9.aloita();
                break;
            default:
                return;
        }
        System.out.println("\nPaina Enter jatkaaksesi...");
        lukija.nextLine();
    }
    
}
