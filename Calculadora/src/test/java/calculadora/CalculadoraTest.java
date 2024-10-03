/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @Test
    public void testSuma(){
        double a=10;
        double b=20;
        assertEquals(30,Calculadora.suma(a, b));
    }
    
    @Test
    public void testResta(){
        double a=30;
        double b=10;
        assertEquals(20,Calculadora.resta(a, b));
    }
    
    @Test
    public void testMultiplicacion(){
        double a=10;
        double b=20;
        assertEquals(200,Calculadora.multiplicacion(a, b));
    }
    
    @Test
    public void testDivision(){
        double a=20;
        double b=10;
        assertEquals(2,Calculadora.division(a, b));
    }
}
