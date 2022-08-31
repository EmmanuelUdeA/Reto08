
package reto82;

public class NegativekilometerException extends Exception{
    public NegativekilometerException(){
        super("Kilimetraje inferior a cero");
    }
}
