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
    
    public static String sprawdz() {
        
        Scanner sc = new Scanner (System.in);
        boolean TylkoLiczby=true;
        String x;
        
        do {
            TylkoLiczby=true;
            x=sc.nextLine();

            for (int i=0; i<x.length(); ++i) { 
                if(x.charAt(i)<'0'|| x.charAt(i)>'9'){ 
                    TylkoLiczby=false;
                    System.out.println("To nie jest cyfra!");
                    break;
                } 
            }
        } while(TylkoLiczby==false);
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c;
        
        
        
        System.out.println("podaj 'a':");       
        a=Double.parseDouble(Main.sprawdz());
        
        System.out.println("podaj 'b':");
        b=Double.parseDouble(Main.sprawdz());
        
        System.out.println("podaj 'c':");
        c=Double.parseDouble(Main.sprawdz());
        
        rownanie_kwadratowe row = new rownanie_kwadratowe(a,b,c);        
        row.licz();
        
        //System.out.println("podaj pierwsza liczbe");
        //a = Integer.parseInt(sc.nextLine());
        
        
        
    }
    
}
