package wordpc;

import com.leocastillo.worldpc.*;

public class WorldPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Keyboard keyboardHP = new Keyboard("Bluetooth", "HP");
        Mouse mouseHP = new Mouse("Bluetooh", "HP");
        Computer computerHP = new Computer("Computadora HP", monitorHP, keyboardHP, mouseHP);

        Monitor monitorGamer = new Monitor("Samsung Curvo", 34);
        Keyboard keyboardGamer = new Keyboard("Teclado", "Logitech");
        Mouse mouseGamer = new Mouse("Mouse gamer", "Redragon");
        Computer computerGamer = new Computer("Computadora gamer", monitorGamer, keyboardGamer, mouseGamer);

        Order orden1 = new Order();
        orden1.addComputer(computerHP);
        orden1.addComputer(computerGamer);

        orden1.showOrder();
    }
}
