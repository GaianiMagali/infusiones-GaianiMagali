package ar.edu.unahur.obj2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestCafe {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    Cafe cafe;

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
        cafe = new Cafe();
    }

    @Test
    public void testRecetaCafe() {
        cafe.calentarAgua();
        cafe.agregarIngrediente();
        cafe.servir();
        cafe.agregarExta();

        String consola = this.consoleContent.toString();

        assertTrue(consola.indexOf("Calentando el agua")!=-1);
        assertTrue(consola.indexOf("Agregar grano de cafe molido")!=-1);
        assertTrue(consola.indexOf("Esta servido en la taza")!=-1);
        assertTrue(consola.indexOf("Agregar azucar y/o leche")!=-1);
    }

    @Test
    public void testTiempoYtemperatura() {
        assertEquals(cafe.getTemperatura(),95.0);
        assertEquals(cafe.getTiempoDeInfusion(),4.0);
    }
}
