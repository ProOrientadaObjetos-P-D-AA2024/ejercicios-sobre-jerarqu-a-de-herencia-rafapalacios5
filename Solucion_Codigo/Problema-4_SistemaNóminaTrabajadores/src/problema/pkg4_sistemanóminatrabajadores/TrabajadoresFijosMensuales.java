/*
Cobran una cantidad fija al mes.
*/
package problema.pkg4_sistemanóminatrabajadores;

public class TrabajadoresFijosMensuales extends Trabajadores {
    private double sueldoMensual;
    private Jefe jefe; 

    public TrabajadoresFijosMensuales(String nombre, String apellidos, String direccion, String DNI, double sueldoMensual, Jefe jefe) {
        super(nombre, apellidos, direccion, DNI);
        this.sueldoMensual = sueldoMensual;
        this.jefe = jefe;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldo) {
        this.sueldoMensual = sueldo;
    }
             
}
