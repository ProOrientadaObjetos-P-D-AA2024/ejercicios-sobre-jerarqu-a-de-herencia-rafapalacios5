
package problema.pkg4_sistemanóminatrabajadores;

public class Trabajadores {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String DNI; 

    public Trabajadores(String nombre, String apellidos, String direccion, String DNI) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direcció) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
       
}
