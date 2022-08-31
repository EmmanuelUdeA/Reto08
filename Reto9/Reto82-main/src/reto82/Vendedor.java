package reto82;

import java.time.LocalDate;

public class Vendedor {

    private int documento;
    private String nombre;
    private String apellido;
    private int edad;
    private Double vendidos;
    private int anoIngresos;
    private String descripcion;

    public final int anosAdulto = 18;
    public final int vendedorPrincipiante = 500000000;
    public final int vendedorIntermedio = 2000000000;
    
    public final int anosEmpleadoNuevo = 2;
    public final int anosEmpleadoExperiencia = 4;
    public final int anosEmpleadoAntiguo = 6;

    public Vendedor(int documento, String nombre, String apellido, int edad, Double vendidos, int anoIngresos, String descripcion) throws AgeLessException, AgeEntryException {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vendidos = vendidos;
        this.anoIngresos = anoIngresos;
        this.descripcion = descripcion;

        LocalDate current_date = LocalDate.now();

        if (anoIngresos > current_date.getYear()) {
            throw new AgeEntryException();
        } else {
            this.anoIngresos = anoIngresos;
        }

        if (edad < anosAdulto) {
            throw new AgeLessException();
        } else {
            this.edad = edad;
        }
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws AgeLessException {

        if (edad < anosAdulto) {
            throw new AgeLessException();
        } else {
            this.edad = edad;
        }
    }

    public Double getVendidos() {
        return vendidos;
    }

    public void setVendidos(Double vendidos) {
        this.vendidos = vendidos;
    }

    public int getAñoingresos() {
        return anoIngresos;
    }

    public void setAñoingresos(int anoIngresos) throws AgeEntryException {

        LocalDate current_date = LocalDate.now();

        if (anoIngresos > current_date.getYear()) {
            throw new AgeEntryException();
        } else {
            this.anoIngresos = anoIngresos;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String obtenerRendimientoVendedor(int i) {
        String Dato = "";
        if (vendidos == 0) {
            Dato = "Novato";
        } else if (vendidos > 0 && vendidos <= vendedorPrincipiante * i) {
            Dato = "Principiante";
        } else if (vendidos > vendedorPrincipiante * i && vendidos <= vendedorIntermedio * i) {
            Dato = "Intermedio";
        } else if (vendidos > vendedorIntermedio * i) {
            Dato = "Avanzado";
        }
        return Dato;
    }

    public void obtenerTipoVendedor() {
        int anoActual = 2022;
        int tiempoTrabajo = anoActual - anoIngresos;

        if (tiempoTrabajo >= 0 && tiempoTrabajo <= anosEmpleadoNuevo) {
            switch (obtenerRendimientoVendedor(1)) {
                case "Novato" ->
                    System.out.println("Malo");
                case "Principiante" ->
                    System.out.println("Regular");
                case "Intermedio" ->
                    System.out.println("bueno");
                case "Avanzado" ->
                    System.out.println("Excelente");
            }

        } else if (tiempoTrabajo > anosEmpleadoNuevo && tiempoTrabajo <= anosEmpleadoExperiencia) {

            switch (obtenerRendimientoVendedor(2)) {
                case "Novato" ->
                    System.out.println("Malo");
                case "Principiante" ->
                    System.out.println("Regular");
                case "Intermedio" ->
                    System.out.println("bueno");
                case "Avanzado" ->
                    System.out.println("Excelente");
            }

        } else if (tiempoTrabajo > anosEmpleadoExperiencia && tiempoTrabajo <= anosEmpleadoAntiguo) {

            switch (obtenerRendimientoVendedor(3)) {
                case "Novato" ->
                    System.out.println("Malo");
                case "Principiante" ->
                    System.out.println("Regular");
                case "Intermedio" ->
                    System.out.println("bueno");
                case "Avanzado" ->
                    System.out.println("Excelente");
            }
        } else if (tiempoTrabajo > anosEmpleadoAntiguo) {
            switch (obtenerRendimientoVendedor(4)) {
                case "Novato" ->
                    System.out.println("Malo");
                case "Principiante" ->
                    System.out.println("Regular");
                case "Intermedio" ->
                    System.out.println("bueno");
                case "Avanzado" ->
                    System.out.println("Excelente");
            }
        }
    }
}
