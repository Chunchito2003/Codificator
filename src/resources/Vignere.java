package resources;
public class Vignere {
    /*
     * Cifrado Vigenère:
     * Es un metodo de cifrado por sustitución polialfabética. Usa una palabra clave
     * para determinar cuánto se desplaza cada letra del mensaje. Cada letra de la
     * clave modifica el desplazamiento del texto de manera diferente, proporcionando
     * mayor seguridad que el cifrado César.
     */

    // Longitud del abecedario usado (a-z) para los cálculos de desplazamiento
    private static final int ALFABETO = 26;

    // Metodo privado para cifrar una sola letra usando una letra de la clave
    private char cifrarLetra(char texto, char clave) {
        // Si no es una letra (por ejemplo un espacio o signo), se deja igual
        if (!Character.isLetter(texto))
            return texto;

        char base = 'a'; // Consideramos letras en minúscula
        int t = texto - base; // Posición de la letra del texto
        int k = clave - base; // Posición de la letra de la clave

        // Aplicamos el desplazamiento y devolvemos el carácter cifrado
        return (char) ((t + k) % ALFABETO + base);
    }

    // Metodo privado para descifrar una sola letra usando una letra de la clave
    private char descifrarLetra(char textoCifrado, char clave) {
        if (!Character.isLetter(textoCifrado))
            return textoCifrado;

        char base = 'a';
        int t = textoCifrado - base;
        int k = clave - base;

        // Aplicamos la resta del desplazamiento y corregimos con +26 para evitar negativos
        return (char) ((t - k + ALFABETO) % ALFABETO + base);
    }

    // Metodo público que recibe un texto plano y una clave, y devuelve el texto cifrado
    public String codificar(String texto, String clave) {
        // Convertimos texto y clave a minúsculas para trabajar con el mismo alfabeto
        texto = texto.toLowerCase();
        clave = clave.toLowerCase();

        if (clave == null || clave.isEmpty()) {
            throw new IllegalArgumentException("La clave no puede estar vacía.");
        }

        StringBuilder resultado = new StringBuilder(); // Acumula el texto codificado
        int claveIndex = 0; // Lleva la posición actual dentro de la clave

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                // Tomamos la letra correspondiente de la clave, repitiéndola si es necesario
                char claveLetra = clave.charAt(claveIndex % clave.length());
                resultado.append(cifrarLetra(c, claveLetra));
                claveIndex++; // Avanzamos solo si el caracter es una letra
            } else {
                resultado.append(c); // Dejamos signos, espacios y otros caracteres sin modificar
            }
        }

        return resultado.toString(); // Retornamos el texto cifrado
    }

    // Metodo público que recibe un texto cifrado y una clave, y devuelve el texto original
    public String decodificar(String textoCifrado, String clave) {
        textoCifrado = textoCifrado.toLowerCase();
        clave = clave.toLowerCase();

        if (clave == null || clave.isEmpty()) {
            throw new IllegalArgumentException("La clave no puede estar vacía.");
        }

        StringBuilder resultado = new StringBuilder(); // Acumula el texto decodificado
        int claveIndex = 0;

        for (char c : textoCifrado.toCharArray()) {
            if (Character.isLetter(c)) {
                char claveLetra = clave.charAt(claveIndex % clave.length());
                resultado.append(descifrarLetra(c, claveLetra));
                claveIndex++;
            } else {
                resultado.append(c); // Conservamos caracteres especiales y espacios
            }
        }

        return resultado.toString(); // Retornamos el texto decodificado
    }
}
