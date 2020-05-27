package org.example.abstractFactory;

public interface ITvAbstractFactory {

    public IColor newColor();
    public ITv newTV();

    public String toString();

}
