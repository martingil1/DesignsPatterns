package org.example.strategy;

public class Director implements ICategory {



    @Override
    public Double modifySalary(Double salary) {
        return salary - (salary * 0.20);
    }
}
