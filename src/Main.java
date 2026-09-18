//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CanalNotificacion email = new NotificadorEmail();
    CanalNotificacion SMS = new NotificadorSMS();
    CanalNotificacion push = new NotificadorPush();

    GestorAlertas nuevoGestor = new GestorAlertas();
    nuevoGestor.registrarCanal(email);
    nuevoGestor.registrarCanal(SMS);
    nuevoGestor.registrarCanal(push);

    System.out.println("=== Difunción Masiva ===");
    nuevoGestor.difundirMasivo("¡Alerta del sistema! Mantenimiento programado a la medianoche.", "contacto_general");


    System.out.println("===Difuncion selectiva por lista específica ===");
    List<CanalNotificacion> seleccion = new ArrayList<>();
    seleccion.add(SMS);
    seleccion.add(push);
    nuevoGestor.difundirSelectivo(seleccion, "dispositivo_o_celular_123", "Código de autenticación de dos pasos: 9812");
}
