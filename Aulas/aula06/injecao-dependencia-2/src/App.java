import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        NotificadorService notificadorService = new NotificadorWhatsapp(List.of(new NotificadorEmail(), new NotificadorSMS));

        notificadorService.notificar("Seu pedido já está sendo processado!");
    }
}