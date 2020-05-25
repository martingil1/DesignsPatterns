package org.example;


import org.example.factoryMethod.ITriangle;
import org.example.factoryMethod.Triangle;
import org.example.factoryMethod.TypeTriangle;
import org.example.strategy.Administrative;
import org.example.strategy.ICategory;
import org.example.strategy.Context;
import org.example.strategy.Director;
import org.example.strategy.Employee;
import org.example.strategy.Operator;

public class App {
    public static void main(String[] args) {
       /* Employee employee = new Employee("pepe", "Director", 2000.00);
        Employee employee1 = new Employee("pepe", "Operator", 2000.00);
        Employee employee2 = new Employee("pepe", "Administrative", 2000.00);

        ICategory category = modifySalary(employee);
        ICategory category1 = modifySalary(employee1);
        ICategory category2 = modifySalary(employee2);

        Context context = new Context(category);
        Context context1 = new Context(category1);
        Context context2 = new Context(category2);

        employee.setSalary(context.executerStrategy(employee.getSalary()));
        employee1.setSalary(context1.executerStrategy(employee1.getSalary()));
        employee2.setSalary(context2.executerStrategy(employee2.getSalary()));

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);*/

        Triangle triangle = new TypeTriangle();

        ITriangle t = triangle.getTriangle(12.00,12.00,12.00);
        t.triangleType();
        ITriangle t1 = triangle.getTriangle(10.00,12.00,10.00);
        t1.triangleType();
        ITriangle t2 = triangle.getTriangle(10.00,12.00,5.00);
        t2.triangleType();


    }

    public static ICategory modifySalary(Employee e) {

        ICategory category ;

        if (e.getCategory().equals("Director")) {
            category = new Director();
        } else if (e.getCategory().equals("Operator")) {
            category = new Operator();
        } else {
            category = new Administrative();
        }
        return category;
    }

}
