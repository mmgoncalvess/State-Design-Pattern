package com.example;

import org.apache.logging.log4j.LogManager;

public class Vibration implements MobileAlertState{

    @Override
    public void alert(AlertContext context) {
        LogManager.getLogger(this.getClass()).info("Vibration: " + this);

    }
}
