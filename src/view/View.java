/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import controller.Controller;

/**
 * 
 * @author Ryhmä 5. Ville Kautonen, Roosa Mäkelä, Pauliina Sapman
 * 
 * Luokka View toimii simulaation pääluokkana. Luokka on siis MVC:n View.
 * Koska tämä on pääluokka, siinä on main-metodi, joka ei tee muuta, kuin suorittaa
 * tässä luokassa määritellyn viewin eli näkymän ja päättää simulaation.
 * 
 * Tämä luokka on siis vastuussa käyttäjälle näkyvästä valikosta
 * ja päävalikon pyörittämisestä.
 * 
 * Luokka ei kuitenkaan tulkitse käyttäjän syötteitä tai hyödynnä (model-tason)
 * malleja. Vaan View ohjaa käyttäjän syötteet Controller luokalle, joka
 * puolestaan hyödyntää niitä.
 * 
 */
public class View {
    static Scanner lukija = new Scanner(System.in);
    private Controller ohjain;
    
    public View() {
        ohjain = new Controller();
    }
    public int pääValikko() {
        System.out.println("Tervetuloa ryhmä 5. testisimulaatioon.");
        System.out.println("Valitse testi syöttämällä numero.");
        System.out.println("1: Harry Potter -tupa");
        System.out.println("2: Alkoholismitesti");
        System.out.println("3: Muumi-testi");
        System.out.println("4: Horoskooppitesti");
        System.out.println("5: Introvertti/ekstroverttitesti");
        System.out.println("6: Tyhmyystesti");
        System.out.println("7: Psykopaattitesti");
        System.out.println("8: Insinööriopiskelijatesti");
        System.out.println("9: Hedelmätesti");
        System.out.println("0: Lopetus");
        System.out.print("Syöte: ");
        int syöttö = lukija.nextInt();
        ohjain.tulkitse(syöttö);
        return syöttö;
    }
    
    private void suorita () {
        int suoritin;
        do {
            suoritin = pääValikko();
        } while (suoritin != 0);
    }
    
    public static void main(String[] args) {
        View view = new View();
        view.suorita();
        System.exit(0);
    }
}
