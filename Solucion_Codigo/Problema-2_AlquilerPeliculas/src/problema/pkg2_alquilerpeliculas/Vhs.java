
package problema.pkg2_alquilerpeliculas;

public class Vhs extends Peliculas {
    private Soporte soportes;
    private double precioBase;

    public Vhs(String título, String autor, int añoEdición, String idioma,Soporte soportes ,double precioBase ) {
        super(título, autor, añoEdición, idioma);
        this.soportes = soportes;
        this.precioBase = precioBase;
    }

    public Soporte getSoportes() {
        return soportes;
    }

    public void setSoportes(Soporte soportes) {
        this.soportes = soportes;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
}
