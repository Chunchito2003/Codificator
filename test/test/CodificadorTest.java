package test;

import codificador.Codificador;
import codificador.Diccionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CodificadorTest {

    Diccionario diccionario = new Diccionario();
    Codificador codificador = new Codificador(diccionario);

    @Test
    public void testCodificarHola() {
        String resultado = codificador.codificar("hola");
        assertEquals("cjwñ", resultado); //
    }

    @Test
    public void testDecodificar() {
        String resultado = codificador.decodificar("cjwñ"); 
        assertEquals("hola", resultado);
    }
    @Test
    public void testCodificarConEspaciosYPuntuacion() {
        String texto = "hola mundo.";
        String resultado = codificador.codificar(texto);
        assertEquals("cjwñ-fniyj_", resultado); // CORRECTO
    }

    @Test
    public void testDecodificarConEspaciosYPuntuacion() {
        String texto = "cjwñ-fniyj_";
        String resultado = codificador.decodificar(texto);
        assertEquals("hola mundo.", resultado); // CORRECTO
    }

    @Test
    public void testCodificarMayusculas() {
        String texto = "HOLA";
        String resultado = codificador.codificar(texto);
        assertEquals("cjwñ", resultado); // se transforma a minusculas
    }

    @Test
    public void testCodificarCaracterNoMapeado() {
        String texto = "hola123";
        String resultado = codificador.codificar(texto);
        assertEquals("cjwñ123", resultado); // numeros no estan en el diccionario
    }

    @Test
    public void testCodificarTextoVacio() {
        String resultado = codificador.codificar("");
        assertEquals("", resultado);
    }

    @Test
    public void testDecodificarTextoVacio() {
        String resultado = codificador.decodificar("");
        assertEquals("", resultado);
    }

    @Test
    public void testCodificarSoloCaracteresNoMapeados() {
        String resultado = codificador.codificar("123$%");
        assertEquals("123$%", resultado); // todos no mapeados
    }

    @Test
    public void testDecodificarCaracterNoMapeado() {
        String resultado = codificador.decodificar("123$%");
        assertEquals("123$%", resultado); // todos no mapeados
    }

    //Pruebas a Vignere
    private codificador.Vignere vigenere;

    @BeforeEach
    public void setUp() {
        vigenere = new codificador.Vignere();
    }

    @Test
    public void testCodificarConEspaciosYSignos() {
        String resultado = vigenere.codificar("hola mundo!", "sol");
        assertEquals("zcws affrz!", resultado);
    }

    @Test
    public void testDecodificarConEspaciosYSignos() {
        String resultado = vigenere.decodificar("zcws affrz!", "sol");
        assertEquals("hola mundo!", resultado);
    }

    @Test
    public void testClaveMasCortaQueTexto() {
        String resultado = vigenere.codificar("ataquealamanecer", "sol");
        assertEquals("shliipszleoywqpj", resultado);
    }

    @Test
    public void testClaveIgualALaLongitudDelTexto() {
        String resultado = vigenere.codificar("ataqueal", "solclave");
        assertEquals("shlsfevp", resultado);
    }
    @Test
    public void testClaveIgualALaLongitudDelTextoDecoficar() {
        String resultado = vigenere.decodificar("shlsfevp", "solclave");
        assertEquals("ataqueal", resultado);
    }

    @Test
    public void testCodificarConCaracteresEspeciales() {
        String resultado = vigenere.codificar("el precio es $100!", "clave");
        assertEquals("gw pmieto zw $100!", resultado);
    }

    @Test
    public void testDecodificarConCaracteresEspeciales() {
        String resultado = vigenere.decodificar("gw pmieto zw $100!", "clave");
        assertEquals("el precio es $100!", resultado);
    }

    @Test
    public void testClaveVacia() {
        assertThrows(IllegalArgumentException.class, () -> {
            vigenere.codificar("hola", "");
        });
    }

}
