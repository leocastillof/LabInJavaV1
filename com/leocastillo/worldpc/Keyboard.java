package com.leocastillo.worldpc;

public class Keyboard extends InputDevices{
    private final int idKeyboard;
    private static int counterKeyboard;

    public Keyboard(String typeDevices, String brand)
    {
        super(typeDevices, brand);
        this.idKeyboard = ++Keyboard.counterKeyboard;
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
