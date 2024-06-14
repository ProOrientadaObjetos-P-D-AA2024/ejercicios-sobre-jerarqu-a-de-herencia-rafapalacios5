
package problema.pkg5_ventaentradasteatro;

public class lateral extends entrada {
    private int numeroLocalidades, tipo;
    private double pNormal,pAbonado,calculoprecio;

    public lateral(String nombres, String apellidos, String id,int tipo) {
        super(nombres,apellidos,id);
        this.numeroLocalidades = 100;
        this.pNormal = 15.5;
        this.pAbonado = 10;
        this.tipo = tipo;
        this.calculoprecio = 0;
    }    

    public int getNumeroLocalidades() {
        return numeroLocalidades;
    }

    public void setNumeroLocalidades(int numeroLocalidades) {
        this.numeroLocalidades = numeroLocalidades;
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

    public double getCalculoprecio() {
        return calculoprecio;
    }

    public void calcularprecio() {
        if (tipo == 1){
            this.calculoprecio = pNormal ;
        }
        
        if(tipo == 2 ){
            this.calculoprecio = pAbonado;
        }
        
        if(tipo == 3){
            this.calculoprecio =  pNormal - (pNormal * 0.15) ;
        }
    }

}
