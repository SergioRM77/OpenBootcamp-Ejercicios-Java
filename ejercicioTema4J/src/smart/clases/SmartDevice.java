package smart.clases;

public class SmartDevice {
    protected boolean bluetooth;
    protected boolean wifi;
    protected double megas;
    protected String nombreDispositivo;

    public SmartDevice(){

    }

    public SmartDevice(boolean bluetooth, boolean wifi, double megas, String nombreDispositivo) {
        this.bluetooth = bluetooth;
        this.wifi = wifi;
        this.megas = megas;
        this.nombreDispositivo = nombreDispositivo;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public double getMegas() {
        return megas;
    }

    public void setMegas(double megas) {
        this.megas = megas;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "bluetooth=" + bluetooth +
                ", wifi=" + wifi +
                ", megas=" + megas +
                ", nombreDispositivo='" + nombreDispositivo + '\'' +
                '}';
    }
}


