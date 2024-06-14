
package problema.pkg3_sistemaenvíomensajesmóviles;


public class SMS extends mensaje {
    private String texto;

    public SMS( celular remitente, celular destino,String texto) {
        super(remitente, destino);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
