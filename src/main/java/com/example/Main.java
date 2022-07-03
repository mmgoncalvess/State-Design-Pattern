package com.example;

public class Main {
    public static void main(String[] args) {
        AlertContext stateContext = new AlertContext();
        stateContext.alert();
        stateContext.alert();
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.alert();
        stateContext.alert();
    }
}
