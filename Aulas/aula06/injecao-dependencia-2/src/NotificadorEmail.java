public class NotificadorEmail implements Notificador{

    @Override
    public void notificarCliente(String mensagem) {
        System.out.printf("O cliente foi notificado via Email com a mensagem: %s", mensagem);
    }
}
