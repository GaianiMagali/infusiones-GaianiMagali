package ar.edu.unahur.obj2;

import TiposDeTe.TeNegro;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestTeNegro {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    TeNegro teNegro;

    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
        teNegro = new TeNegro();
    }

    @Test
    public void testRecetaTeNegro() {
        teNegro.calentarAgua();
        teNegro.agregarIngrediente();
        teNegro.servir();
        teNegro.agregarExta();

        String consola = this.consoleContent.toString();

        assertTrue(consola.indexOf("Calentando el agua")!=-1);
        assertTrue(consola.indexOf("Agregar hojitas de te")!=-1);
        assertTrue(consola.indexOf("Esta servido en la taza")!=-1);
        assertTrue(consola.indexOf("Agregar azucar,leche o  limon")!=-1);
    }

    @Test
    public void testTiempoYtemperatura() {
        assertEquals(teNegro.getTemperatura(),95.0);
        assertEquals(teNegro.getTiempoDeInfusion(),6.0);
    }
}
