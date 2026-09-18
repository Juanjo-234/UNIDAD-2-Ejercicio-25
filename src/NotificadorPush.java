public class NotificadorPush implements CanalNotificacion{
    public void enviar(String destinatario, String mensaje) {
        if (destinatario == null && destinatario.isEmpty()) {
            System.out.println("ERROR. Token de dispositivo no disponible para notificaciones push");
            return;
        }
        System.out.println("Enviando notficacion al dispositivo : " + destinatario);
        System.out.println("Cuerpo: " + mensaje);
    }
}
