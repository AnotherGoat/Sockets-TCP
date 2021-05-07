public class MainCliente {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("USO: java -jar MainCliente.jar <host> <puerto>");
            System.exit(0);
        }

        String host = args[0];
        int puerto = Integer.parseInt(args[1]);

        ClienteTCP cliente = new ClienteTCP(host, puerto);
        cliente.iniciar();
    }
}
