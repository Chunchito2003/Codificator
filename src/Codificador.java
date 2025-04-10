package codificador;
public class Codificador {

    private codificador.Diccionario diccionario;

    //constructor
    public Codificador(codificador.Diccionario diccionario) {
        this.diccionario = diccionario;
    }

    public String codificar(String texto){
        // Convertir el texto a minusculas
        texto = texto.toLowerCase();

        StringBuilder resultado = new StringBuilder();
        for (char c : texto.toCharArray()) {
            // Obtener el mapeo para el caracter actual
            Character mapped = diccionario.getMapping(c);
            if (mapped != null) {
                resultado.append(mapped);
            } else {
                // Si el caracter no tiene mapeo, se deja sin cambios
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public String decodificar(String textoCodificado) {
        StringBuilder resultado = new StringBuilder();
        for (char c : textoCodificado.toCharArray()) {
            Character original = diccionario.getInvertedMapping(c);
            if (original != null) {
                resultado.append(original);
            } else {
                resultado.append(c); // no codificado, lo dejamos igual
            }
        }
        return resultado.toString();
    }
}
