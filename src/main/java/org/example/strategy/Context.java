package org.example.strategy;

public class Context {

    private ICategory category;

    public Context(ICategory category) {
        this.category = category;
    }

    public Double executerStrategy (Double d){
        return this.category.modifySalary(d);
    }


}
