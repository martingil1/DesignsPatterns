package org.example.strategy;

public class Administrative implements ICategory {


    @Override
    public Double modifySalary(Double salary) {
        return  salary + (salary * 0.15);
    }
}
