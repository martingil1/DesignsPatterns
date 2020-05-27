package org.example.abstractFactory;

public class PlasmaYellow implements ITvAbstractFactory{

    @Override
    public IColor newColor() {
        return new Yellow();
    }

    @Override
    public ITv newTV() {
        return new Plasma();
    }

    @Override
    public String toString() {
        return "Plasma Yellow";
    }
}
