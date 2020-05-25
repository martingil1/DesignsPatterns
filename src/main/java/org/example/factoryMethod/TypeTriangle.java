package org.example.factoryMethod;

public class TypeTriangle extends Triangle{

    ITriangle iTriangle;


    @Override
    public ITriangle getTriangle(Double side1, Double side2, Double side3) {

        if(side1.equals(side2) & side1.equals(side3)){
            iTriangle = new Equilatero();
        }else if(!side1.equals(side2) & !side1.equals(side3) & !side2.equals(side3)){
            iTriangle = new Escaleno();
        }else{
            iTriangle = new Isosceles();
        }
        return iTriangle;
    }
}
