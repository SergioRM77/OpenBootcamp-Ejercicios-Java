package smart.clases;

public class SmartWatch extends SmartDevice{
    protected int pulsaciones;
    protected boolean sumergible;
    protected String marca;

    public SmartWatch() {

    }

    public SmartWatch(boolean bluetooth, boolean wifi, double megas, String nombreDispositivo, int pulsaciones, boolean sumergible, String marca) {
        super(bluetooth, wifi, megas, nombreDispositivo);
        this.pulsaciones = pulsaciones;
        this.sumergible = sumergible;
        this.marca = marca;
    }

    public int getPulsaciones() {
        return pulsaciones;
    }

    public void setPulsaciones(int pulsaciones) {
        this.pulsaciones = pulsaciones;
    }

    public boolean isSumergible() {
        return sumergible;
    }

    public void setSumergible(boolean sumergible) {
        this.sumergible = sumergible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "pulsaciones=" + pulsaciones +
                ", sumergible=" + sumergible +
                ", marca='" + marca + '\'' +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", megas=" + megas +
                ", nombreDispositivo='" + nombreDispositivo + '\'' +
                '}';
    }
}
