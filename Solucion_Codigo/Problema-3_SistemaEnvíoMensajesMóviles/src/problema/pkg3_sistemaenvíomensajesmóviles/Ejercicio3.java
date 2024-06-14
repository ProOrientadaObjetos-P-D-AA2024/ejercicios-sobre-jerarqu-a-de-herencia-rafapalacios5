
package problema.pkg3_sistemaenvíomensajesmóviles;

public class Ejercicio3 {
    public static void main(String[] args) {
        //objetos
        celular p1=new celular("Esther","0992105521" );
        celular p2=new celular("Eduarda","0995226560");
        SMS sms = new SMS(p1, p2, "Hola, ¿cómo estás?");
        MMS mms = new MMS(p2, p1, "hola");
        sms.enviarMensaje();
        System.out.println(sms.getTexto());
        mms.enviarMensaje();
        System.out.println(mms.getNombreArchivo());
    }
    
}
