import java.math.*;
public class PrecioIVA {
    public static void main(String[] args) {

        System.out.println(precioConIVA(114));
        double resultado = precioConIVA(84);
        System.out.println(resultado);
    }
    public static double precioConIVA(double precio){
        return precio + (precio * 21 / 100);
    }
}
