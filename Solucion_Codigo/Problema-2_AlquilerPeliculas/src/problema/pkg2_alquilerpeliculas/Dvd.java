
package problema.pkg2_alquilerpeliculas;

public class Dvd extends Peliculas {
    
    private double capacidadGb;
    private double precioBase;
    
    public Dvd(String título, String autor, int añoEdición, String idioma,double capacidadGb, double precioBase) {
        super(título, autor, añoEdición, idioma);
        this.capacidadGb = capacidadGb;
        this.precioBase = precioBase;    
    }
 
    public double getCapacidadGb() {
        return capacidadGb;
    }

    public void setCapacidadGb(double capacidadGb) {
        this.capacidadGb = capacidadGb;
    }

    public double calcularPrecioBase() {
        double precioT;
        precioT=precioBase*1.10;
        return precioT;
    }
    
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
  
}
