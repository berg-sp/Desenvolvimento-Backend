import java.util.List;

public class NotificadorService {
    private List<Notificador> notificadores;

    public NotificadorService(List<Notificador> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificar(String mensagem) {
        for (Notificador notificador : notificadores) {
            
        }
    }
}
