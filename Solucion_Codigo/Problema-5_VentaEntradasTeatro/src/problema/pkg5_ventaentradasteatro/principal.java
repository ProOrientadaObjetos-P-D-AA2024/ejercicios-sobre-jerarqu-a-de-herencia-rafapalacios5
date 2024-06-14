
package problema.pkg5_ventaentradasteatro;

public class principal extends entrada {
    private int nLocalidad,tipo ;
    private double pNormal,pAbonado, calcularprecio;

    public principal(String nombres, String apellidos, String id, int tipo) {
        super(nombres, apellidos, id);
        this.nLocalidad = 200;
        this.pNormal = 25;
        this.pAbonado = 17.5;
        this.tipo = tipo;
        this.calcularprecio = 0;
    }

    public int getnLocalidad() {
        return nLocalidad;
    }

    public void setnLocalidad(int nLocalidad) {
        this.nLocalidad = nLocalidad;
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

    public double getCalcularprecio() {
        return calcularprecio;
    }

    public void calcularprecio() {
        if (tipo == 1){
            this.calcularprecio = pNormal ;
        }
        
        if(tipo == 2 ){
            this.calcularprecio = pAbonado;
        }
        
        if(tipo == 3){
            this.calcularprecio =  pNormal - (pNormal * 0.15) ;
        }
    }
    
}
