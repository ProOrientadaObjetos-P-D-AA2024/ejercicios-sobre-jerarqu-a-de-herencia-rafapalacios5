
package problema.pkg3_sistemaenvíomensajesmóviles;

public class MMS extends mensaje {
    private String nombreArchivo;

    public MMS( celular remitente, celular destino,String nombreArchivo) {
        super(remitente, destino);
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    
}
