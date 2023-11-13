package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SwitchContext lightSwitch = new SwitchContext();

        lightSwitch.turnOn();  // Outputs: Turning on the light.
        lightSwitch.turnOn();  // Outputs: Light is already on.
        lightSwitch.turnOff(); // Outputs: Turning off the light.

        lightSwitch.turnOff(); // Outputs: Light is already off.
        lightSwitch.turnOff(); // Outputs: Light is already off.
        lightSwitch.turnOn();  // Outputs: Turning on the light.
    }
}