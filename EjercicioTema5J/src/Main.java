import com.coche.CocheCRUD;
import com.coche.CocheCRUDImpl;

public class Main {
    public static void main(String[] args) {
        CocheCRUD coche = new CocheCRUDImpl();
        coche.findAll();
        coche.delete();
        coche.save();
    }
}
