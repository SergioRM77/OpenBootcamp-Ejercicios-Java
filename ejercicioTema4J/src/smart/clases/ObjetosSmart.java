package smart.clases;


public class ObjetosSmart {
    public static void main(String[] args) {
        SmartPhone telefono = new SmartPhone(true, true, 125.2, "IphonePepe", 30.5, true, true, "Iphone");
        System.out.println(telefono);

        SmartWatch reloj = new SmartWatch();
        reloj.setBluetooth(true);
        reloj.setMegas(80.55);
        reloj.setNombreDispositivo("relojPepe");

        reloj.setWifi(true);
        reloj.setPulsaciones(109);
        reloj.setSumergible(true);
        reloj.setMarca("Aguafresca");
        System.out.println(reloj);

    }
}
