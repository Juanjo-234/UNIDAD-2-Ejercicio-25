public class NotificadorEmail implements CanalNotificacion{
      public void enviar(String destinatario, String mensaje) {
          if (destinatario == null || !destinatario.contains("@")) {
              System.out.println("Error: Dirección de email no válida para " + destinatario);
              return;
          }
          System.out.println("[EMAIL] Enviando correo a: " + destinatario);
          System.out.println("Mensaje: " + mensaje);

      }
}
