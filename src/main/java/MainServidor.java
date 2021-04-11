public class MainServidor {

    public static void main(String[] args) {

        int puerto = 80;

        ServidorTCP servidor = new ServidorTCP(puerto);
        servidor.iniciar();
    }
}
