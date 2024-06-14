/*
cobra un sueldo fijo (no hay que calcularlo). 
Cada empleado tiene obligatoriamente un jefe
*/
package problema.pkg4_sistemanóminatrabajadores;

public class Jefe extends Trabajadores {
    private double sueldoFijo;

    public Jefe(String nombre, String apellidos, String direccion, String DNI, double sueldoFijo) {
        super(nombre, apellidos, direccion, DNI);
        this.sueldoFijo = sueldoFijo;
    }

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }
      
}
