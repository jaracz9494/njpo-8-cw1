/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg08_cw1.Main;
import pkg08_cw1.rownanie_kwadratowe;

/**
 *
 * @author Dominik
 */
public class testy {
    
    public testy() {
    }
    
    @Test
    public void test1() {
        double a = 1.0;
        double b = 1.0;
        double c = 1.0;
        rownanie_kwadratowe instance = new rownanie_kwadratowe(a,b,c);
        instance.licz();
        
        double expR = -3.0;
        double result = instance.delta;
        
        assertEquals("delta dla 1,1,1 powinna rowna -3", expR, result, 0.0);
        
    }
    
    @Test
    public void Test2() {
        double a = 0;
        double b = 0;
        double c = 0;
        rownanie_kwadratowe instance = new rownanie_kwadratowe(a,b,c);
        instance.licz();
        
        double expR = 0;
        double result = instance.delta;
        
        assertEquals("delta dla 0,0,0 powinna rowna 0", expR, result, 0.0);
        
    }
    
    @Test
    public void Test3() {
        
        rownanie_kwadratowe instance = new rownanie_kwadratowe();
        instance.licz();
        
        double expR = 0;
        double result = instance.a+instance.b+instance.c;
        
        assertEquals("a,b i c = 0", expR, result, 0.0);
    }
    
    @Test
    public void Test4() {
        double a = 1;
        double b = 6;
        double c = 9;
        rownanie_kwadratowe instance = new rownanie_kwadratowe(a,b,c);
        instance.licz();
        
        double expR = 0;
        double result = instance.delta;
        
        assertEquals("delta dla 1,6,9 powinna rowna 0", expR, result, 0.0);
        
    }
    
    @Test
    public void Test5() {
        double a = 1;
        double b = -5;
        double c = -5;
        rownanie_kwadratowe instance = new rownanie_kwadratowe(a,b,c);
        instance.licz();
        
        double expR = 45;
        double result = instance.delta;
        
        assertEquals("delta dla 1,-5,-5 powinna byc rowna 45", expR, result, 0.0);
        
    }
    
    @Test
    public void Test6() {
        
        double a = 0;
        double b = 1;
        double c = 1;
        rownanie_kwadratowe instance = new rownanie_kwadratowe(a,b,c);
        instance.licz();
        
        double expR = 0;
        double result = instance.delta;
        
        assertEquals("delta dla a lub b rownego 0 bedzie wyzerowana", expR, result, 0.0);
        
    }
    
    
            
            
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
