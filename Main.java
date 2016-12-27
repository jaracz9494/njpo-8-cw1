/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_cw1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Dominik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("podaj 'a':");
        a=Double.parseDouble(sc.nextLine());
        System.out.println("podaj 'b':");
        b=Double.parseDouble(sc.nextLine());
        System.out.println("podaj 'c':");
        c=Double.parseDouble(sc.nextLine());
        
        rownanie_kwadratowe row = new rownanie_kwadratowe(a,b,c);        
        row.licz();
        
        //System.out.println("podaj pierwsza liczbe");
        //a = Integer.parseInt(sc.nextLine());
        
        
        
    }
    
}
