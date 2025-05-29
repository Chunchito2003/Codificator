package codificador;
public class Codificador {

    private codificador.Diccionario diccionario;

    //constructor
    public Codificador(codificador.Diccionario diccionario) {

        this.diccionario = diccionario;
    }

    //Metodo público que recibe un String texto y devuelve otro String.
    public String codificar(String texto){
        // Convertir el texto a minusculas para no tener que codificar los valores de las mañusculas
        texto = texto.toLowerCase();

        //Crea un StringBuilder vacío → aquí irá acumulando el texto codificado
        //es más eficiente si vas a ir añadiendo muchas letras una por una.
        StringBuilder resultado = new StringBuilder();
        //recorre el array con un for-each pero de caracteres
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
        //transforma el  contenido del StringBuilder convertido a String
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
