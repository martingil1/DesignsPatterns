package org.example.abstractFactory;

public class LCD implements ITv {
    @Override
    public IColor setColor(IColor color) {
        return color;
    }

    @Override
    public String toString() {
        return "LCD";
    }

}
