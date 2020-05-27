package org.example.abstractFactory;

public class Blue implements IColor{


    @Override
    public ITv tvColor(ITv tv) {
        tv.setColor(this);
        return tv;
    }
    @Override
    public String toString() {
        return "Blue";
    }

}
