/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_cw1;

import static java.lang.Math.sqrt;

/**
 *
 * @author Dominik
 */
public class rownanie_kwadratowe {
    public double a,b,c; 
    public double delta;
    
    public rownanie_kwadratowe() {        
    }
    
    public rownanie_kwadratowe(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    
    public void licz() {
        
        delta=(b*b)-(4*a*c);
        
        if (a==0 || b==0) {
            System.out.println("a i b nie mogą być zerem!");
        } else {
            
            if (delta<0) {
                System.out.println("Równanie nie ma rozwiązania");
            }

            if (delta > 0){
                double x1, x2;
                x1=(-b-sqrt(delta))/(2*a);
                x2=(-b+sqrt(delta))/(2*a);
                System.out.println("wyniki:\n x1=" + x1 + "\n x2=" + x2);
            }

            if (delta == 0) {          
                double x;
                x = -b/(2*a);
                System.out.println("wynik: x=" + x);           
            }
        }   
    }
    
    
}
