//importar la clase Scanner del paquete de java.util para leer las entradas de usuario//
import java.util.Scanner;

//Crear Clase principal Vehiculo//
public class Vehiculo {
    //Metodo principal, o sea el punto de entrada del programa//
    public static void main(String[] args) {
        //Crear Try y objeto Scanner para leer las entradas desde la consola, ademas de cerrar Scanner automaticamente al finalizar//
        try (Scanner scanner = new Scanner(System.in)) {
            //solicitar al usuario que ingrese su nombre//
            System.out.print("Ingrese su nombre: ");
            //leer el nombre ingresado por el usuario y almacenarla en la variable "nombre"//
            String nombre = scanner.nextLine();

            //solicitar al usuario que ingrese su edad//
            System.out.print("Ingrese su edad: ");
            //leer la edad ingresada por el usuario y almacenarla en la variable "edad"//
            int edad = scanner.nextInt();
            //limpiar salto de linea//
            scanner.nextLine();

            //solicitar al usuario que ingrese la marca del vehiculo//
            System.out.print("Ingrese la marca: ");
            //leer la marca ingresada por el usuario y almacenarla en la variable "marca"//
            String marca = scanner.nextLine();

            //solicitar al usuario que ingrese el modelo del vehiculo//
            System.out.print("Ingrese el modelo: ");
            //leer el modelo ingresado por el usuario y almacenarla en la variable "modelo"//
            String modelo = scanner.nextLine();
            
            //solicitar al usuario que ingrese la cilindrada del vehiculo//
            System.out.print("Ingrese la cilindrada (ej: 1400cc): ");
            //leer la cilindrada ingresada por el usuario y almacenarla en la variable "cilindrada"//
            String cilindrada = scanner.nextLine();
            
            //solicitar al usuario que ingrese el tipo de combustible del vehiculo//
            System.out.print("Ingrese el tipo de combustible: ");
            //leer el tipo de combustible ingresado por el usuario y almacenarla en la variable "combustible"//
            String combustible = scanner.nextLine();

            //solicitar al usuario que ingrese la cantidad de pasajeros del vehiculo//
            System.out.print("Ingrese la capacidad de pasajeros: ");
            //leer la capacidad de pasajeros ingresada por el usuario y almacenarla en la variable "pasajeros"//
            int pasajeros = scanner.nextInt();

            //Muestra en consola los datos ingresados por el usuario//
            System.out.println("\nNombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("La marca que ha ingresado es: " + marca);
            System.out.println("El modelo que ha ingresado es: " + modelo);
            System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
            System.out.println("El tipo de combustible es: " + combustible);
            System.out.println("Tiene una capacidad de " + pasajeros + " pasajeros.");
        }
    }
}