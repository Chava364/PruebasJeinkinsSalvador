public class Main {

    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
        repetirMensaje();
        repetirMensaje(); // Código duplicado
    }

    public static void repetirMensaje() {
        System.out.println("Este mensaje se repite."); // Método sin uso directo
    }

    public static void metodoSinUsar() {
        System.out.println("Este método no se utiliza."); // Código no usado
    }
}
