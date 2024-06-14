
package problema.pkg3_sistemaenvíomensajesmóviles;

public class mensaje {
    private celular remitente;
    private celular destino;

    public mensaje(celular remitente, celular destino) {
        this.remitente = remitente;
        this.destino = destino;
    }

    public celular getRemitente() {
        return remitente;
    }

    public void setRemitente(celular remitente) {
        this.remitente = remitente;
    }

    public celular getDestino() {
        return destino;
    }

    public void setDestino(celular destino) {
        this.destino = destino;
    }
    public void enviarMensaje(){
        System.out.println("Mensaje enviado desde " + remitente.getNumero() + " a " + destino.getNumero());
    
    }
    
}
