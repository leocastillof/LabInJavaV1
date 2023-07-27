package com.leocastillo.worldpc;

public class Mouse {
    private int idMouse;
    private int counterMouses;

    public Mouse(String typeDevices, String brand)
    {

    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("idMouse=").append(idMouse);
        sb.append(", counterMouses=").append(counterMouses);
        sb.append('}');
        return sb.toString();
    }
}
