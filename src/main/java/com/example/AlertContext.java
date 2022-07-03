package com.example;

public class AlertContext {

    private MobileAlertState currentState;

    public AlertContext()
    {
        currentState = new Vibration();
    }

    public void setState(MobileAlertState state)
    {
        currentState = state;
    }

    public void alert()
    {
        currentState.alert(this);
    }
}
