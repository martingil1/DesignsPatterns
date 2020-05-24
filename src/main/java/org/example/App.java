package org.example;


import org.example.strategy.Administrative;
import org.example.strategy.ICategory;
import org.example.strategy.Context;
import org.example.strategy.Director;
import org.example.strategy.Employee;
import org.example.strategy.Operator;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("pepe", "Director", 2000.00);
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
        System.out.println(employee2);

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
