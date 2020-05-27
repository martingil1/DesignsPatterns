package org.example.abstractFactory;

public class LCDBlue implements ITvAbstractFactory{


    @Override
    public IColor newColor() {
        return new Blue();
    }

    @Override
    public ITv newTV() {
        return new LCD();
    }

    @Override
    public String toString() {
        return "LCD Blue";
    }
}
