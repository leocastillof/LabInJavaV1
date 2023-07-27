package com.leocastillo.worldpc;

public class Keyboard {
    private int idKeyboard;
    private int counterKeyboard;

    public Keyboard(String typeDevices, String brand)
    {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Keyboard{");
        sb.append("idKeyboard=").append(idKeyboard);
        sb.append(", counterKeyboard=").append(counterKeyboard);
        sb.append('}');
        return sb.toString();
    }
}
