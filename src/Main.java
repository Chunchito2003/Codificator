import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instancia de las clases
        codificador.Diccionario diccionario= new codificador.Diccionario();
        codificador.Codificador codificador = new codificador.Codificador(diccionario);

        //creacion de los elementos para el bucle
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        //variable donde se guarda el texto
        String texto = "";

        while (continuar) {
            try {
                System.out.println("1 para codificar un mensaje\n2 para decodificarlo\n3 para SALIR");
                int op = entrada.nextInt();
                entrada.nextLine(); // Consumir el salto de línea

                switch (op) {
                    case 1:
                        System.out.println("Ingrese el Mensaje :)");
                        texto = entrada.nextLine();
                        texto = codificador.codificar(texto);
                        System.out.println("Mensaje codificado: " + texto);
                        break;

                    case 2:
                        System.out.println("Decodificando el Mensaje :/");
                        System.out.println("Mensaje decodificado: " + codificador.decodificar(texto));
                        break;

                    case 3:
                        System.out.println("Saliendo ....");
                        continuar = false;
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: necesitas introducir un número como opción.");
                entrada.nextLine(); // Limpiar el bufer
            }
        }
    }
}