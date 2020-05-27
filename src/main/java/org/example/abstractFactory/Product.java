package org.example.abstractFactory;

public class Product {

    private ITvAbstractFactory factory;
    private ITv tv;

    public Product(ITvAbstractFactory factory){
        this.factory = factory;
        this.tv = factory.newTV();
        IColor color = factory.newColor();
        tv = color.tvColor(tv);
    }

    @Override
    public String toString() {
        return " "+factory;
    }
}
