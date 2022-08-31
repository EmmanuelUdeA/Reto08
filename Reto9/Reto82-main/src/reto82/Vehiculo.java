
package reto82;


public class Vehiculo {
    private String placa;
    private String modelo;
    private String marca;
    private String descripcion;
    private String color;
    
    private Double kilometraje;    
    private Double precio;
    
    private int anoFabricacion;
    
    public final int carroNuevo = 1000;
    public final int carroUsado = 20000;
    public final int carroMuyUsado = 100000; 
    
    public final int anosNuevo = 2;
    public final int anosIntermedio = 8;
    
    
    public Vehiculo(String placa, String modelo, String marca, Double kilometraje, String color, Double precio, int añoFabricacion, String descripcion) throws NegativekilometerException{
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.color = color;
        this.precio = precio;
        this.anoFabricacion = añoFabricacion;
        this.descripcion = descripcion;
        
        if (kilometraje < 0){
            throw new NegativekilometerException();
        }else{
            this.kilometraje = kilometraje;
        }   
    }
    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) throws NegativekilometerException{
        
        if (kilometraje < 0){
            throw new NegativekilometerException();
        }else{
            this.kilometraje = kilometraje;
        }           
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getAñoFabricacion() {
        return anoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.anoFabricacion = añoFabricacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void usoAutomovil(){
    
        if(kilometraje == 0){
            System.out.println("0 km");
        }else if (kilometraje > 0 && kilometraje <= carroNuevo){
            System.out.println("Nuevo");
        }else if (kilometraje > carroNuevo && kilometraje <= carroUsado){
            System.out.println("Casi Nuevo");
        }else if (kilometraje > carroUsado && kilometraje <= carroMuyUsado){
            System.out.println("Usado");
        }else if (kilometraje > carroMuyUsado){
            System.out.println("Muy Usado");
        }
    }
    
    public void obtenerCategoria(){
        int anoActual = 2022;
        int edadVehiculo = anoActual - anoFabricacion;
        
        if (edadVehiculo == 0){
            System.out.println("Ultimo Modelo");            
        }else if (edadVehiculo > 0 && edadVehiculo <= anosNuevo){
            System.out.println("Nuevo");
        }else if (edadVehiculo > anosNuevo && edadVehiculo <= anosIntermedio){
            System.out.println("Intermedio");
        }else if (edadVehiculo > anosIntermedio){
            System.out.println("Antiguo");        
        }
    }
}
