package ar.edu.unahur.obj2;

import TiposDeTe.TeBlanco;
import TiposDeTe.TeNegro;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestTeBlanco {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    TeBlanco teBlanco;

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
        teBlanco = new TeBlanco();
    }

    @Test
    public void testRecetaTeBlanco() {
        teBlanco.calentarAgua();
        teBlanco.agregarIngrediente();
        teBlanco.servir();
        teBlanco.agregarExta();

        String consola = this.consoleContent.toString();

        assertTrue(consola.indexOf("Calentando el agua")!=-1);
        assertTrue(consola.indexOf("Agregar hojitas de te")!=-1);
        assertTrue(consola.indexOf("Esta servido en la taza")!=-1);
        assertTrue(consola.indexOf("Agregar azucar,leche o  limon")!=-1);
    }

    @Test
    public void testTiempoYtemperatura() {
        assertEquals(teBlanco.getTemperatura(),85.0);
        assertEquals(teBlanco.getTiempoDeInfusion(),4.0);
    }
}
