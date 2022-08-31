
package reto8.pkg1;




// Alejandro Becerra
// Emmanuel Bustamante




public class Reto81 {


    public static void main(String[] args) {
        
        //
        TramoVia tramoA = new TramoAsfaltado(-4,0,0,-2,"coltan",80.3,true);
        TramoVia tramoB = new TramoAsfaltado(0,-2,2,-6,"rolt",50.3,false);
        TramoVia tramoC = new TramoNoAsfaltado(2,-6,6,-4,"piedra",0.3);
        TramoVia tramoD = new TramoNoAsfaltado(6,-4,4,0,"Arena",0.3);
        TramoVia tramoE = new TramoNoAsfaltado(4,4,8,4,"Balastro",0.3);
        
        
        Carretera gaitan = new Carretera();
        
        gaitan.setVias(tramoA);
        gaitan.setVias(tramoB);
        gaitan.setVias(tramoC);
        gaitan.setVias(tramoD);
        gaitan.setVias(tramoE);
        
        
        
        System.out.println("");
        System.out.println("Carretera Gauitan");
        System.out.println("");
        gaitan.getTramosConectados();
        System.out.print("Longitud Total: " + gaitan.getLongitudTotal());
        System.out.println("");
        System.out.print("Area Total: " + gaitan.getAreaTotal());
        System.out.println("");
        System.out.print("Volumen Total: " + gaitan.getVolumenTotal());
        System.out.println("");
        System.out.print("Volumen Asfalto: " + gaitan.getVolumenAsfaltoTotal());
        System.out.println("");
        System.out.print("Volumen Sin Asfalto: " + gaitan.getVolumenNoAsfaltoTotal());
        System.out.println("");
        System.out.print("Distancia Tercer Tramo: " + tramoC.getLongitud());
        System.out.println("");
        System.out.print("Area Primer Tramo: " + tramoA.getArea());
        System.out.println("");
        System.out.print("Volumen Primer Tramo: " + tramoA.getVolumen());
        System.out.println("");
        
        Carretera eliecer = new Carretera();
        
        eliecer.setVias(tramoA);
        eliecer.setVias(tramoB);
        eliecer.setVias(tramoC);
        
        System.out.println("");
        System.out.println("Carretera Eliecer");
        System.out.println("");
        System.out.print("Longitud Total: " + eliecer.getLongitudTotal());
        System.out.println("");
        System.out.print("Area Total: " + eliecer.getAreaTotal());
        System.out.println("");
        System.out.print("Volumen Total: " + eliecer.getVolumenTotal());
        System.out.println("");
        System.out.print("Volumen Asfalto: " + eliecer.getVolumenAsfaltoTotal());
        System.out.println("");
        System.out.println("Volumen Sin Asfalto: " + eliecer.getVolumenNoAsfaltoTotal());
        
        eliecer.getTramosConectados();

        
    }
    
}
