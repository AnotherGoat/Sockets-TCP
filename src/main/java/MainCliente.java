public class MainCliente {

    public static void main(String[] args) {

        String host = args[0];
        int puerto = Integer.parseInt(args[1]);

        ClienteTCP cliente = new ClienteTCP(host, puerto);
        cliente.iniciar();
    }
}
