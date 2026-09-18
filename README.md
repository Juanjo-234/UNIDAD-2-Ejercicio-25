Resolución del ejercicio N°25 de la unidad 2 de programación 2.
Este programa simula un sistema de comunicación corporativa centralizado capaz de difundir alertas y mensajes institucionales de manera masiva o selectiva a través de múltiples canales de transmisión mediante el uso de interfaces y colecciones.

Clases e Interfaz Utilizadas
CanalNotificacion (Interfaz): Define el contrato estándar para el envío de mensajes a un destinatario.
NotificadorEmail: Implementa la interfaz simulando el envío de correos electrónicos a una bandeja de entrada.
NotificadorSMS: Implementa la interfaz simulando el envío de mensajes de texto mediante redes de telefonía con validación de tamaño.
NotificadorPush: Implementa la interfaz simulando el envío de notificaciones emergentes a dispositivos móviles.
GestorAlertas: Clase coordinadora que administra una colección de canales y permite realizar difusiones masivas o selectivas.
