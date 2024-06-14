
package problema.pkg2_alquilerpeliculas;

public class Ejecutor {
    public static void main(String[] args) {
        
        Soporte soporteVhs = new Soporte ("Mecánico");
        Soporte soporteVhs2 = new Soporte ("Magneticos");
        Soporte soporteVhs3 = new Soporte ("Opticos");
        Soporte soporteVhs4 = new Soporte ("Estado Solido");
        
        Dvd d1 = new Dvd("La sirenita", "Christian Andersen",2000,"Español - Ingles" ,2.5,4);
        Dvd d2 = new Dvd("Rapidos y furiosos", "Louis Leterrier", 2005, "Español - Ingles - Portugues",3.5,3.50);
        Dvd d3 = new Dvd("Son como niños", "Dennis Dugan", 2010,"Frances - Español - Ingles",3.0,2);

        Vhs vhs1 = new Vhs("Pitufos", "kelly Asbury", 2011, "Español", soporteVhs,2.50);
        Vhs vhs2 = new Vhs("Intensamente", "Pete Docter", 2002, "Español",soporteVhs2, 3);
        Vhs vhs3 = new Vhs("Tiburon", "Steven Spielberg", 1975, "Español", soporteVhs3, 3.50);
        
        
        System.out.println("Peliculas alquiladas");
        System.out.println("Persona 1: " );
        System.out.println("Alquila: 2 películas en DVD");
        System.out.println("Titulo: "+d1.getTítulo()+", "+"Autor: "+d1.getAutor()+", "
                           +"Idioma: "+d1.getIdioma()+", "+"Año de Edicion: "+d1.getAñoEdición()+", "
                           +"Capacidad: "+d1.getCapacidadGb()+"GB "+", "+"Precio: "+d1.calcularPrecioBase());
        System.out.println("Titulo: "+d2.getTítulo()+", "+"Autor: "+d2.getAutor()+", "
                           +"Idioma: "+d2.getIdioma()+", "+"Año de Edicion: "+d2.getAñoEdición()+", "
                           +"Capacidad: "+d2.getCapacidadGb()+ "GB " +", "+"Precio: "+d2.calcularPrecioBase());
        
        System.out.println(" ");
        System.out.println("Persona 2: ");
        System.out.println("Alquila: 1 película en VHS");
        System.out.println("Titulo: "+vhs1.getTítulo()+", "+"Autor: "+vhs1.getAutor()+", "+"Idioma: "+vhs1.getIdioma()+", "
                           +"Año de edicion: "+vhs1.getAñoEdición()+", "+vhs1.getSoportes()+", "
                           +"Precio: "+vhs1.getPrecioBase());
        
        System.out.println(" ");
        System.out.println("Persona 3: ");
        System.out.println("Alquila: 1 película en VHS y 1 película en DVD");
        System.out.println("Titulo: "+vhs3.getTítulo()+", "+"Autor: "+vhs3.getAutor()+", "+"Idioma: "+vhs3.getIdioma()+", "
                           +"Año de edicion: "+vhs3.getAñoEdición()+", "+vhs3.getSoportes()+", "
                           +"Precio: "+vhs3.getPrecioBase());
        System.out.println("Titulo: "+d3.getTítulo()+", "+"Autor: "+d3.getAutor()+", "
                           +"Idioma: "+d3.getIdioma()+", "+"Año de Edicion: "+d3.getAñoEdición()+", "
                           +"Capacidad: "+d3.getCapacidadGb()+"GB "+", "+"Precio: "+d3.calcularPrecioBase());
                                       
    }   
}
