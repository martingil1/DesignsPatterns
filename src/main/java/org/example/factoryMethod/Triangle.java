package org.example.factoryMethod;

public abstract class Triangle {

    private Double side1;
    private Double side2;
    private Double side3;



    public abstract ITriangle getTriangle(Double side1, Double side2, Double side3);

}
