
package problema.pkg5_ventaentradasteatro;

public class entrada {
   protected String nombres, apellidos,id;

    public entrada(String nombres, String apellidos, String id) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
}
