import com.RecorrerArrays.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main extends arrays{

    public static void main(String[] args) {

        String Texto = "hola mundo";
        String arrayString[] = {"hola ", "a ", "todos ", "aquí"};
        int arrayBidi[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        Vector vector = new Vector(5,5);
        vector.add(11);
        vector.add(45);
        vector.add(874);
        vector.add(22);
        vector.add(76);

        ArrayList <String> lista = new ArrayList<>();
        lista.add("Esto ");
        lista.add("es ");
        lista.add("un ");
        lista.add("array lista");
        LinkedList <String> lista2 = new LinkedList<>(lista);

        ArrayList <Integer> listInt = new ArrayList<>();



        System.out.println(reverse(Texto));

        recorreArrayString(arrayString);

        recorreArrayBiInt(arrayBidi);

        System.out.println(vector);
        removeInVector(vector, 874);
        removeInVector(vector, 22);
        System.out.println(vector);
        /*
         * Si tuvieramos por defecto los 100, y sabemos que vamos a necesitar 1000, esto sería muy costoso ya que al incrementar
         * interiormente lo que hace es crear otro vector con el incremento por defecto que si es 100 pasa a 200, se copiaría
         * una y otra vez hasta llegar a los 1000, lento y pesado
         * */

        System.out.println("arrayList: " + lista.toString());
        System.out.println("LinkedList: " + lista2.toString());
        recorreArray(lista);
        recorreArray(lista2);

        System.out.println(rellenoArrayList(listInt));

        System.out.println(dividir(10, 5));
        System.out.println(dividir(10, 0));
    }
    public static String reverse(String texto) {
        String resultado = "";
        for (int i = texto.length()-1; i >= 0; i--){
           resultado += texto.charAt(i);
        }
        return  resultado;
    }
}
