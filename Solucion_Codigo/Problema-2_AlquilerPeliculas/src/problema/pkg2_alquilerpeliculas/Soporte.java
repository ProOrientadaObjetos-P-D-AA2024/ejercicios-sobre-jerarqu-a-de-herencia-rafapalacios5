
package problema.pkg2_alquilerpeliculas;

public class Soporte {
    /*
    Soportes mecánicos
    Soportes magnéticos
    Soportes ópticos
    Soportes en estado sólido
    */
    
    private String soportes;

    public Soporte(String soportes) {
        this.soportes = soportes;
    }

    public String getSoportes() {
        return soportes;
    }

    public void setSoportes(String soportes) {
        this.soportes = soportes;
    }
    
    @Override
    public String toString() {
        return "Tipo de Soporte: " + soportes;
    }
    
}
