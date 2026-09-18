import java.util.ArrayList;
import java.util.List;

public class GestorAlertas {
    private List<CanalNotificacion> canales;

    public GestorAlertas() {
        this.canales = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacion canal) {
        if (canal != null) {
            canales.add(canal);
        }
    }

    public void eliminarCanal(CanalNotificacion canal) {
        canales.remove(canal);
    }

    public void difundirMasivo(String mensaje, String destinatarioGeneral) {
        System.out.println("--- INICIO DE DIFUSIÓN MASIVA ---");
        if (canales.isEmpty()) {
            System.out.println("No hay canales registrados en el gestor.");
            return;
        }

        for (CanalNotificacion canal : canales) {
            canal.enviar(destinatarioGeneral, mensaje);
        }
        System.out.println("--- FIN DE DIFUSIÓN MASIVA ---\n");
    }

    public void difundirSelectivo(List<CanalNotificacion> canalesSeleccionados, String destinatario, String mensaje) {
        System.out.println("--- INICIO DE DIFUSIÓN SELECTIVA ---");
        for (CanalNotificacion canal : canalesSeleccionados) {
            if (canales.contains(canal)) {
                canal.enviar(destinatario, mensaje);
            } else {
                System.out.println("Aviso: Uno de los canales seleccionados no está registrado en el gestor.");
            }
        }
        System.out.println("--- FIN DE DIFUSIÓN SELECTIVA ---\n");
    }
}




