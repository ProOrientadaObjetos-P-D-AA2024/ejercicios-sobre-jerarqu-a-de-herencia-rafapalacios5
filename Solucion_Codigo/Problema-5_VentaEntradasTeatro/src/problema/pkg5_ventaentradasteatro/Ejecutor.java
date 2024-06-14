
package problema.pkg5_ventaentradasteatro;
import java.util.ArrayList;
import java.util.Scanner;
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);    
    int opc;
    boolean ingresar;
    int almacenar;
    ArrayList <principal> pr = new ArrayList <>();
    ArrayList <palcoB> pa = new ArrayList <>();
    ArrayList <central> c = new ArrayList <>();
    ArrayList <lateral> l = new ArrayList <>();

    ingresar = true;

     do{
         System.out.println("------Menu------");
         System.out.println("Vender entradas    [1]");
         System.out.println("Consulta entradas  [2]");
         System.out.println("Salir              [0]");
         opc = entrada.nextInt();
         switch(opc){
             case 1:
                int zona,tipo;
                String nombre,apellido,id;
                System.out.println("-----Zona-----");
                System.out.println("Zona Principal [1]");
                System.out.println("Zona PalcoB    [2]");
                System.out.println("Zona Central   [3]");
                System.out.println("Zona Lateral   [4]");
                zona = entrada.nextInt();
                System.out.println("-----Tipo de Entrada-----");
                System.out.println("Normal                     [1]");
                System.out.println("Abonado                    [2]");
                System.out.println("Estudiante o pensionista   [3]");
                tipo = entrada.nextInt();
                switch(zona){
                    case 1:
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        nombre = entrada.nextLine();
                        System.out.print("Ingrese el apellido: ");
                        apellido = entrada.nextLine();
                        System.out.print("Ingrese el numero de cedula: ");
                        id = entrada.nextLine();        
                        principal p1 = new principal (nombre,apellido,id,tipo);
                        p1.calcularprecio();
                        System.out.println("Zona Principal");
                        System.out.println("Nombre:"+p1.getNombres()+"Apellido: "+p1.getApellidos()+ "Cedula: "+ p1.getId());
                        System.out.println("El valor de la entrada es de "+p1.getCalcularprecio());
                        pr.add(p1);
                        break;
                    case 2: 
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        nombre = entrada.nextLine();
                        System.out.print("Ingrese el apellido: ");
                        apellido = entrada.nextLine();
                        System.out.print("Ingrese el numero de cedula: ");
                        id = entrada.nextLine();        
                        palcoB p2 = new palcoB(nombre,apellido,id,tipo);
                        p2.calcularPrecio();
                        System.out.println("Zona Palco B");
                        System.out.println("Nombre:"+p2.getNombres()+"Apellido: "+p2.getApellidos()+ "Cedula: "+ p2.getId());
                        System.out.println("El valor de la entrada es de "+p2.getCalcularPrecio());
                        pa.add(p2);
                        break;
                    case 3:
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        nombre = entrada.nextLine();
                        System.out.print("Ingrese el apellido: ");
                        apellido = entrada.nextLine();
                        System.out.print("Ingrese el numero de cedula: ");
                        id = entrada.nextLine();        
                        central p3 = new central(nombre,apellido,id,tipo);
                        p3.calcularprecio();
                        System.out.println("Zona Central");
                        System.out.println("Nombre:"+p3.getNombres()+"Apellido: "+p3.getApellidos()+ "Cedula: "+ p3.getId());
                        System.out.println("El valor de la entrada es de "+p3.getCalcularprecio());
                        c.add(p3);
                        break;
                    case 4:
                        entrada.nextLine();
                        System.out.print("Ingrese el nombre: ");
                        nombre = entrada.nextLine();
                        System.out.print("Ingrese el apellido: ");
                        apellido = entrada.nextLine();
                        System.out.print("Ingrese el numero de cedula: ");
                        id = entrada.nextLine();        
                        lateral p4 = new lateral(nombre,apellido,id,tipo);
                        p4.calcularprecio();
                        System.out.println("Zona Lateral");
                        System.out.println("Nombre:"+p4.getNombres()+"Apellido: "+p4.getApellidos()+ "Cedula: "+ p4.getId());
                        System.out.println("El valor de la entrada es de "+p4.getCalculoprecio());
                        l.add(p4);
                        break;
                }
             case 2:
                String nombre1;
                int co = 0;
                entrada.nextLine();
                System.out.println("Ingrese a nombre de quien compro la entrada : ");
                nombre1 = entrada.nextLine();
                for(int i = 0; i < pr.size(); i++){
                    if(nombre1.equals(pr.get(i).getNombres())){
                        System.out.println("ZONA PRINCIPAL");
                        System.out.println("Entrada del cliente: "+pr.get(i).getNombres()+" "+pr.get(i).getApellidos());
                        co = co+1; 
                    }
                }
                for(int i = 0; i < pa.size(); i++){
                    if(nombre1.equals(pa.get(i).getNombres())){
                        System.out.println("ZONA PALCO B");
                        System.out.println("Entrada del cliente: "+pa.get(i).getNombres()+" "+pa.get(i).getApellidos());
                        co= co+1; 
                    }
                }
                for(int i = 0; i < c.size() ; i++){
                    if(nombre1.equals(c.get(i).getNombres())){
                        System.out.println("ZONA CENTRAL");
                        System.out.println("Entrada del cliente: "+c.get(i).getNombres()+" "+c.get(i).getApellidos());
                        co = co+1; 
                    }
                }
                for(int i = 0; i < l.size() ; i++){
                    if(nombre1.equals(l.get(i).getNombres())){
                        System.out.println("ZONA LATERAL");
                        System.out.println("Entrada del cliente: "+l.get(i).getNombres()+" "+l.get(i).getApellidos());
                        co = co+1; 
                    }
                }
                break;
             default:
                System.out.println("NO HAY DATOS");
                break;
            }
            ingresar = false;
            System.out.print("\nDesea ingresa entradas [1]SI [2]NO:  ");
            almacenar = entrada.nextInt();
            if(almacenar == 1){
                ingresar = true;
            }
        }while(opc!=0);
    }
    
}
