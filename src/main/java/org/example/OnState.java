package org.example;

public class OnState implements SwitchState{
    @Override
    public void turnOn(SwitchContext context) {
        System.out.println("Light is already on.");

    }

    @Override
    public void turnOff(SwitchContext context) {
        System.out.println("Turning off the light.");
        context.setState(new OffState());

    }
}
