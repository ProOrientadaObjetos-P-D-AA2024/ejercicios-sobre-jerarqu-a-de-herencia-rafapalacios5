/* 
cobran un precio por cada una de las horas que han realizado durante el mes. 
El precio es fijo para las primeras 40 horas y es otro para las horas realizadas a partir de la 40 hora mensual.
*/
package problema.pkg4_sistemanóminatrabajadores;

public class TrabajadoresPorHora extends Trabajadores {
    private double salarioMes;
    private int horasMes;
    private Jefe jefe;

    public TrabajadoresPorHora(String nombre, String apellidos, String direccion, String DNI, int horasMes, Jefe jefe) {
        super(nombre, apellidos, direccion, DNI);
        this.salarioMes = salarioMes;
        this.horasMes = horasMes;
        this.jefe = jefe;
    }

    public int getHorasMes() {
        return horasMes;
    }

    public void setHorasMes(int horasMes) {
        this.horasMes = horasMes;
    }
    
    public double getSalarioMes() {
        return salarioMes;
    }

    public void CalcularSalarioMes() {
        double precioHora= 2;
        double precioHoraExtra= 2.50;
        if (horasMes<=40) {
            salarioMes = horasMes * precioHora;
        }else{
            salarioMes = horasMes * precioHoraExtra; 
        }
    }           
}
