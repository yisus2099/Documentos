package Model;

import Model.Exceptions.*; // Importamos las excepciones

/**
 * @author José Sebastian López Ibarra
 * Friday March 17 2023
 */

public class Fecha {
    private int day, month, year; // Declaramos variables privadas de tipo entero.

    public Fecha(int day, int month, int year) throws invalidDay, invalidMonth { // El constructor recoge las excepciones.
        this.day = day;
        this.month = month;
        this.year = year;
        // Condición que determina si un día es válido.
        if (day < 1 || day > 31) {
            // En caso de no serlo, manda una excepción.
            throw new invalidDay("Por favor, introduce un día válido.");
        }
        // Condición que determina si un mes es válido.
        if (month < 1 || month > 12) {
            // En caso de no serlo, manda una excepción
            throw new invalidMonth("Por favor, introduce un mes válido.");
        }
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    
    // Método que determina si el año introducido es bisiesto o no.
    public boolean isLeapYear(int year) {        
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
        
    public void sustractAddDays(int day1, int day2) {
    
    }
    
    public void sustractAddMonths(int month1, int month2) {
        
    }
    
    public void sustractAddYears(int year1, int year2) {
        
    }
}
