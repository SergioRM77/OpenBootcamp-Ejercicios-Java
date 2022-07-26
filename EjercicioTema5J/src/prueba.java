public class prueba {
    public static void main(String[] args) {
        int array[][] = {
                {1,2,3,4},
                {10,20,30,40}
        };
        for (int i = 0; i < array.length; i++){
            System.out.println("array posicion linea: " + i);
            for(int j = 0; j < array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
