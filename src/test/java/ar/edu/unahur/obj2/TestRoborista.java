package ar.edu.unahur.obj2;

import TiposDeTe.TeBlanco;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestRoborista {
    private final PrintStream originalStdOut = System.out;
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();
    Roborista roborista;
    TeBlanco teBlanco;


    @BeforeMethod
    public void setUp() {
        System.setOut(new PrintStream(this.consoleContent));
        roborista = new Roborista();
        teBlanco = new TeBlanco();
    }

    @Test
    public void testRoborista() {
        roborista.preparacion(teBlanco);
        String consola = this.consoleContent.toString();

        Assert.assertTrue(consola.indexOf("Calentando el agua")!=-1);
        Assert.assertTrue(consola.indexOf("Agregar hojitas de te")!=-1);
        Assert.assertTrue(consola.indexOf("Esta servido en la taza")!=-1);
        Assert.assertTrue(consola.indexOf("Agregar azucar,leche o  limon")!=-1);
    }

}

