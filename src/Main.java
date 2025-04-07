//falta hacer un try-catch validando las opciones
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //instancia de las clases
        Diccionario diccionario= new Diccionario();
        Codificador codificador = new Codificador(diccionario);

        //creacion de los elementos para el bucle
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        //variable donde se guarda el texto
        String texto = "";

        while (continuar){

            System.out.println("1 para codificar un mensaje\n2 para decodificarlo\n3 para SALIR");
            int op = entrada.nextInt();
            entrada.nextLine(); // Consumir el salto de línea

            switch (op){
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
                    System.out.println("Opcion no valida.");
                    break;
            }
        }
    }
}