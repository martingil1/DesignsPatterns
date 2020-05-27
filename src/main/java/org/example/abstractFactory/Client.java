package org.example.abstractFactory;

public class Client {

    private String name;
    private Product product;

    public Client(Product product, String name){
        this.product = product;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cliente: " + name;
    }

}
