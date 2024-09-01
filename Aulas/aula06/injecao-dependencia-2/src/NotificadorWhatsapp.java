public class NotificadorWhatsapp implements Notificador{

    @Override
    public void notificarCliente(String mensagem) {
        System.out.println("Cliente notificdo via Whatsapp: " + mensagem);
    }

}
