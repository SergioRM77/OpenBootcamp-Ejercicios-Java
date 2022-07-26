public class ConcatenarTexto {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Carlos", "Manuel", "Ana"};
        String resultado = "";
        for (String nombre: nombres) {
            resultado += nombre + " ";
        }
        System.out.println(resultado);
    }
}
