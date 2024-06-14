
package problema.pkg4_sistemanóminatrabajadores;

public class Ejecutor {

    public static void main(String[] args) {
        Jefe jefe = new Jefe("Luis", "Garcia", "Zamora Huayco", "1123456789", 1200);
        
        TrabajadoresComisionistas tc = new TrabajadoresComisionistas ("Carmen", "Gonzalez", "Pradera", "1198765432", 600, 5,jefe);
        
        TrabajadoresFijosMensuales fm= new TrabajadoresFijosMensuales("Domenica", "Hidalgo", "Los Rosales", "1129384756", 450, jefe);
        
        TrabajadoresPorHora th = new TrabajadoresPorHora("Carlos", "Riofrio", "Las Pitas", "1127384965", 80, jefe);
        
        System.out.println("Jefe de la empresa ");
        System.out.println("Nombre: "+jefe.getNombre());
        System.out.println("Apellido: "+jefe.getApellidos());
        System.out.println("Cedula: "+ jefe.getDNI());
        System.out.println("Direccion: "+ jefe.getDireccion());
        System.out.println("Sueldo: "+ jefe.getSueldoFijo());
        
        System.out.println("");
        System.out.println("Nómina del Mes");
        
        System.out.println("Trabajador 1"); //trabajador por hora
        System.out.println("Nombre: "+th.getNombre());
        System.out.println("Apellido: "+th.getApellidos());
        System.out.println("Cedula: "+ th.getDNI());
        System.out.println("Direccion: "+ th.getDireccion());
        System.out.println("Horas trabajadas en el mes: " +th.getHorasMes());
        th.CalcularSalarioMes();
        System.out.println("Salario Total: "+ th.getSalarioMes());
        
        System.out.println(" ");
        System.out.println("Trabajador 2 "); //Trabajador comisionista
        System.out.println("Nombre: "+tc.getNombre());
        System.out.println("Apellido: "+tc.getApellidos());
        System.out.println("Cedula: "+ tc.getDNI());
        System.out.println("Direccion: "+ tc.getDireccion());
        System.out.println("Ventas Realizadas: "+tc.getVentasRealizadas());
        System.out.println("Porcentaje Fijo por cada venta: "+tc.getPorcentajeFijo());
        tc.calcularSueldoTotal();
        System.out.println("Sueldo Total: "+ tc.getSueldoTotal());
        
    }
    
}
