package com.leocastillo.worldpc;

public class Monitor {
    private int idMonitor;
    private String brand;
    private double size;
    private int counterMonitors;

    public Monitor(String brand, double size)
    {
        this.brand = brand;
        this.size = size;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getCounterMonitors() {
        return counterMonitors;
    }

    public void setCounterMonitors(int counterMonitors) {
        this.counterMonitors = counterMonitors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", size=").append(size);
        sb.append(", counterMonitors=").append(counterMonitors);
        sb.append('}');
        return sb.toString();
    }
}
