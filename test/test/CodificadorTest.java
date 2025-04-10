package test;

import codificador.Codificador;
import codificador.Diccionario;
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
}
