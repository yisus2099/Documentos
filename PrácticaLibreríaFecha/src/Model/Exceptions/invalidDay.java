package Model.Exceptions;


/**
 * @author José Sebastian López Ibarra
 * Friday March 17 2023
 */

public class invalidDay extends Exception { // Clase que hereda de la clase Exception.
    
    public invalidDay() {
        
    }
    
    public invalidDay(String msg) { // Función que determina una excepción.
        super(msg);
    }
}
