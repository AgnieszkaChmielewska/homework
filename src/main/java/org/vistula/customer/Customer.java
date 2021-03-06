package org.vistula.customer;

import org.vistula.basket.BasketItem;

import java.util.List;

public class Customer {

    private String firstName;
    private String lastName;
    private int age;
    private List<BasketItem> basket;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<BasketItem> getBasket() {
        return basket;
    }

    public void setBasket(List<BasketItem> basket) {
        this.basket = basket;
    }

    public Customer(String firstName, String lastName, int age, List<BasketItem> basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.basket = basket;
    }

    public boolean isAdult () {
        if (age >= 18) {return true;
            } else {return false;}
    }
}
