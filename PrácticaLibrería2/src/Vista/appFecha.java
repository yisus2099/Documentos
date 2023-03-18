package Vista;

import java.util.Scanner; // Importamos la clase Scanner.
import Model.Fecha; // Importamos la clase fecha de la librería.
import Model.Exceptions.*; // Importamos las excepciones de la librería.
import java.util.InputMismatchException; // Importamos la clase inputMismatchException.

/**
 * @author José Sebastian López Ibarra
 * Friday March 17 2023
 */

public class appFecha {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creamos una variable de tipo scanner para introducir datos desde consola.
        
        // Dentro de un try-catch validamos los datos introducidos.
        try {
            // Pedimos al usuario que introduzca su fecha de nacimiento.
            System.out.println("Introduce tu día de nacimiento: ");
            int day = input.nextInt();
            System.out.println("Introduce tu mes de nacimiento: ");
            int month = input.nextInt();
            System.out.println("Introduce tu año de nacimiento: ");
            int year = input.nextInt();
            
            Fecha first = new Fecha(day, month, year); // Instanciamos un objeto de la clase fecha.
            System.out.println("Tu fecha de nacimiento es: " + first.getDay() + ", " + first.getMonth() + ", " + first.getYear()); // Mostramos los datos en consola.
            System.out.println("¿Naciste en año bisiesto? - " + first.isLeapYear(year));
        } catch (invalidDay d) { // En caso de no introducir un día válido, se mandará el mensaje propuesto.
            System.out.println(d.getMessage());
        } catch (invalidMonth m) { // Los mismo sucede con el mes.
            System.out.println(m.getMessage());
        } catch (InputMismatchException e) { // Por otro lado, si el usuario no introduce un número entero, se mandará otro mensaje.
            System.out.println("Introduce un número entero.");
        }
    }
}
