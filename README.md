Este programa está diseñado para modelar y gestionar un sistema flexible de difusión de alertas a través de múltiples canales de comunicación (como correo electrónico, mensajes de texto y notificaciones push) utilizando polimorfismo, una interfaz común de notificación y un gestor centralizado mediante programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz CanalNotificacion: Establece el contrato modular estándar que todo canal de comunicación debe cumplir, declarando el método abstracto fundamental enviar(String destinatario, String mensaje).

Implementa clases concretas (NotificadorEmail, NotificadorSMS, NotificadorPush): Heredan y ejecutan la interfaz adaptando la lógica de envío con sus respectivas reglas de formato, simulación de conexión con proveedores externos (servidores SMTP, pasarelas SMS o servicios de notificaciones push móviles) y validaciones de formato de destino.

Desarrolla la clase GestorAlertas: Actúa como el centro coordinador que mantiene una colección o lista de canales de notificación activos (List<CanalNotificacion>) y provee métodos para difundir mensajes de manera masiva a todos los canales o de forma selectiva a canales específicos.

Ejecuta la prueba polimórfica (main): Instancia el gestor de alertas, le añade diversos canales de notificación configurados, simula el envío masivo de una alerta corporativa urgente y muestra el reporte detallado del estado de envío por consola.
