public class MainServidor {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("USO: java -jar MainServidor.jar <puerto>");
            System.exit(0);
        }

        int puerto = Integer.parseInt(args[0]);

        ServidorTCP servidor = new ServidorTCP(puerto);
        servidor.iniciar();
    }
}
