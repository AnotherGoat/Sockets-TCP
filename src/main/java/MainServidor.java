public class MainServidor {

    public static void main(String[] args) {

        int puerto = Integer.parseInt(args[0]);

        ServidorTCP servidor = new ServidorTCP(puerto);
        servidor.iniciar();
    }
}
