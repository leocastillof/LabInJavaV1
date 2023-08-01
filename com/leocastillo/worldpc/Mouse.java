package com.leocastillo.worldpc;

public class Mouse extends InputDevices{
    private final int idMouse;
    private static int counterMouses;

    public Mouse(String typeDevices, String brand)
    {
        super(typeDevices, brand);
        this.idMouse = ++Mouse.counterMouses;

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
