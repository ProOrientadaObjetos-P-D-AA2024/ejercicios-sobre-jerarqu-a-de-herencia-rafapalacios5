/*
cobran un porcentaje fijo por las ventas que han realizado
*/
package problema.pkg4_sistemanóminatrabajadores;

public class TrabajadoresComisionistas extends Trabajadores {
    private int ventasRealizadas;
    private double porcentajeFijo;
    private double sueldoTotal;
    private Jefe jefe;

    public TrabajadoresComisionistas(String nombre, String apellidos, String direccion, String DNI, int ventasRealizadas, double porcentajeFijo, Jefe jefe) {
        super(nombre, apellidos, direccion, DNI);
        this.ventasRealizadas = ventasRealizadas;
        this.porcentajeFijo = porcentajeFijo;
        this.sueldoTotal = 0;
        this.jefe = jefe;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getPorcentajeFijo() {
        return porcentajeFijo;
    }

    public void setPorcentajeFijo(double porcentajeFijo) {
        this.porcentajeFijo = porcentajeFijo;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public void calcularSueldoTotal() {
        sueldoTotal= ventasRealizadas * (porcentajeFijo/100);
    }
     
}
