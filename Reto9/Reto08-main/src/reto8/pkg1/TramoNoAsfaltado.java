
package reto8.pkg1;

public class TramoNoAsfaltado extends TramoVia{
    
    private String tipoMaterial;
    private double espesor;   
    private final int ancho = 6;

    public TramoNoAsfaltado(double inicioX,double inicioY,double finX,double finY, String tipoMaterial, double espesor) {
        super(inicioX,inicioY,finX,finY);
        this.tipoMaterial = tipoMaterial;
        this.espesor = espesor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {        
       this.tipoMaterial = tipoMaterial;
    }

    public double getEspesor() {
        return espesor;
    }

    public void setEspesor(double espesor) {
        this.espesor = espesor;
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
