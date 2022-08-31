
package reto82;

public class Reto82 {

    public static void main(String[] args) {

        try {
            Llanta nuevaLlanta = new Llanta("goodgear", "tre", -20);
            //nueva.setPeso(-20);
        } catch (NegativeWeightTireException e) {
            System.out.println(e.getMessage());
        }
        try {
            Motor nuevoMotor = new Motor(100, "goodgear", "tre", -40, "Motor xy");
        } catch (NegativeWeightEngineException e) {
            System.out.println(e.getMessage());
        }
        try {
            Vendedor nuevoVendedor = new Vendedor(1001018117, "Emmanuel", "Bustamante", 17, (double) 50000000, 2026, "Vendedoxy");
        } catch (AgeLessException e) {
            System.out.println(e.getMessage());
        } catch (AgeEntryException e) {
            System.out.println(e.getMessage());

        }
    }
}