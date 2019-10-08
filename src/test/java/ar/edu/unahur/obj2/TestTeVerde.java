package ar.edu.unahur.obj2;

import TiposDeTe.TeBlanco;
import TiposDeTe.TeVerde;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestTeVerde {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    TeVerde teVerde;


    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
        teVerde = new TeVerde();
    }

    @Test
    public void testRecetaTeBlanco() {
        teVerde.calentarAgua();
        teVerde.servir();
        teVerde.agregarExta();
        teVerde.agregarIngrediente();

        String consola = this.consoleContent.toString();

        assertTrue(consola.indexOf("Calentando el agua")!=-1);
        assertTrue(consola.indexOf("Agregar hojitas de te")!=-1);
        assertTrue(consola.indexOf("Esta servido en la taza")!=-1);
        assertTrue(consola.indexOf("Agregar azucar,leche o  limon")!=-1);
    }

    @Test
    public void testTiempoYtemperatura() {
        assertEquals(teVerde.getTemperatura(),65.0);
        assertEquals(teVerde.getTiempoDeInfusion(),1.30);
    }
}
