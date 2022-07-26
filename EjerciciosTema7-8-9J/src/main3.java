import com.persona.persona;
import com.persona.exportar_a_fichero;

import java.util.ArrayList;

public class main3 extends exportar_a_fichero{
    public static void main(String[] args) {
        persona perona1 = new persona("Sergio Romero", 29, false);
        persona perona2 = new persona("Maria Paez", 39, true);
        persona perona3 = new persona("Lorenzo Martín", 25, false);
        ArrayList<persona>listaPersonas = new ArrayList<>();
        listaPersonas.add(perona1);
        listaPersonas.add(perona2);
        listaPersonas.add(perona3);
        insertar_en_fichero("DatosPersonas.txt",listaPersonas);
        copyFile("DatosPersonas.txt", "DatosCopia.txt");
    }
}
