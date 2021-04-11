public class MainCliente {

    public static void main(String[] args) {

        String host = "127.0.0.1";
        int puerto = 80;

        ClienteTCP cliente = new ClienteTCP(host, puerto);
        cliente.iniciar();
    }
}
