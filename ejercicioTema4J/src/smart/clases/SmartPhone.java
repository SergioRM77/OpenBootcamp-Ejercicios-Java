package smart.clases;

public class SmartPhone extends SmartDevice{
    protected double camaraMegapx;
    protected boolean llamadas;
    protected boolean store;
    protected String marca;

    public SmartPhone(){

    }


    public SmartPhone(boolean bluetooth, boolean wifi, double megas, String nombreDispositivo,
                      double camaraMegapx, boolean llamadas, boolean store, String marca) {
        super(bluetooth, wifi, megas, nombreDispositivo);
        this.camaraMegapx = camaraMegapx;
        this.llamadas = llamadas;
        this.store = store;
        this.marca = marca;
    }

    public double getCamaraMegapx() {
        return camaraMegapx;
    }

    public void setCamaraMegapx(double camaraMegapx) {
        this.camaraMegapx = camaraMegapx;
    }

    public boolean isLlamadas() {
        return llamadas;
    }

    public void setLlamadas(boolean llamadas) {
        this.llamadas = llamadas;
    }

    public boolean isStore() {
        return store;
    }

    public void setStore(boolean store) {
        this.store = store;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camaraMegapx=" + camaraMegapx +
                ", llamadas=" + llamadas +
                ", store=" + store +
                ", marca='" + marca + '\'' +
                ", bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", megas=" + megas +
                ", nombreDispositivo='" + nombreDispositivo + '\'' +
                '}';
    }
}
