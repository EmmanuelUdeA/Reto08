
package reto8.pkg1;

public class TramoAsfaltado extends TramoVia{
    
    private String proveedor;
    private double velocidadMaxima;
    private boolean adelantar;
    
    private final int ancho = 8;
    private final double espesor = 0.25;      

    public TramoAsfaltado(double inicioX,double inicioY,double finX,double finY,String proveedor, double velocidadMaxima, boolean adelantar) {
        super(inicioX,inicioY,finX,finY); 
        this.proveedor = proveedor;
        this.velocidadMaxima = velocidadMaxima;
        this.adelantar = adelantar;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public boolean isAdelantar() {
        return adelantar;
    }

    public void setAdelantar(boolean adelantar) {
        this.adelantar = adelantar;
    }    


    @Override
    public double getLongitud() {
       return Math.sqrt(Math.pow(finX-inicioX,2)+ Math.pow(finY-inicioY,2));
    }

    
    @Override
    public double getArea() {
        return ancho*getLongitud();
    }

    
    @Override
    public double getVolumen() {
        return espesor*getArea();
    }
    
}
