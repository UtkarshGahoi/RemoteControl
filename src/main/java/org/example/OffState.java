package org.example;

public class OffState implements SwitchState{
    @Override
    public void turnOn(SwitchContext context) {
        System.out.println("Turning on the light.");
        context.setState(new OnState());
    }
    @Override
    public void turnOff(SwitchContext context) {
        System.out.println("Light is already off.");
    }
}
