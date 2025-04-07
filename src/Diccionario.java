import java.util.HashMap;
import java.util.Map;

public class Diccionario {

    private final Map<Character, Character> diccionario;
    private final Map<Character, Character> diccionarioInverso = new HashMap<>();

    //constructor
    public Diccionario() {
        this.diccionario = new HashMap<>();
        //codificacion simple, a cada caracter se lo reemplaza por otro a eleccion
        diccionario.put('a','ñ');
        diccionario.put('b','u');
        diccionario.put('c','l');
        diccionario.put('d','y');
        diccionario.put('e','m');
        diccionario.put('f','p');
        diccionario.put('g','a');
        diccionario.put('h','c');
        diccionario.put('i','d');
        diccionario.put('j','b');
        diccionario.put('k','r');
        diccionario.put('l','w');
        diccionario.put('m','f');
        diccionario.put('n','i');
        diccionario.put('ñ','x');
        diccionario.put('o','j');
        diccionario.put('p','e');
        diccionario.put('q','g');
        diccionario.put('r','h');
        diccionario.put('s','z');
        diccionario.put('t','k');
        diccionario.put('u','n');
        diccionario.put('v','o');
        diccionario.put('w','q');
        diccionario.put('x','s');
        diccionario.put('y','v');
        diccionario.put('z','t');

        diccionario.put(' ','-');
        diccionario.put('.','_');
        diccionario.put(',',':');

        for (Map.Entry<Character, Character> entry : diccionario.entrySet()) {
            diccionarioInverso.put(entry.getValue(), entry.getKey());
        }
    }

    public Character getMapping(Character key) {
        return diccionario.get(key);
    }

    public Character getInvertedMapping(Character key) {
        return diccionarioInverso.get(key);
    }
}
