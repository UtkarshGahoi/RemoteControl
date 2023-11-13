package org.example;

public class SwitchContext {
    private SwitchState state;

    public SwitchContext() {
        this.state = new OffState(); // Initial state is Off
    }

    public void turnOn() {
        state.turnOn(this);
    }

    public void turnOff() {
        state.turnOff(this);
    }

    public void setState(SwitchState state) {
        this.state = state;
    }
}
