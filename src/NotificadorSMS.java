public class NotificadorSMS implements CanalNotificacion{
    String mensajeFinal;

   public void enviar(String destinatario, String mensaje){
       if(destinatario == null || destinatario.length() > 8){
           System.out.println("ERROR. Numero de telefono invalidado para SMS");
           return;
       }
       System.out.println("[SMS] Enviando mensaje al celular: " + destinatario);
       System.out.println("Texto: " + this.mensajeFinal);
   }
}
