package org.example.strategy;

public class Operator implements ICategory {


    @Override
    public Double modifySalary(Double salary) {
        return salary + (salary * 0.40);

    }
}
