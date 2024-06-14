
package problema.pkg5_ventaentradasteatro;

public class palcoB extends entrada {
    private int localidad,tipo ;
    private double pNormal,pAbonado, calcularPrecio;

    public palcoB(String nombres, String apellidos, String id, int tipo) {
        super(nombres, apellidos, id);
        this.localidad = 40;
        this.tipo = tipo;
        this.pNormal = 70;
        this.pAbonado = 40;
        this.calcularPrecio = 0;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getpNormal() {
        return pNormal;
    }

    public void setpNormal(double pNormal) {
        this.pNormal = pNormal;
    }

    public double getpAbonado() {
        return pAbonado;
    }

    public void setpAbonado(double pAbonado) {
        this.pAbonado = pAbonado;
    }

    public double getCalcularPrecio() {
        return calcularPrecio;
    }



    public void calcularPrecio() {
        if (tipo == 1){
            this.calcularPrecio = pNormal ;
        }
        
        if(tipo == 2 ){
            this.calcularPrecio = pAbonado;
        }
        
        if(tipo == 3){
            this.calcularPrecio =  pNormal - (pNormal * 0.15) ;
        }
    }
    
}
