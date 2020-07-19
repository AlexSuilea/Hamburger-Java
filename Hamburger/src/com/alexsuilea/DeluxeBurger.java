package com.alexsuilea;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(String name, String rollType, String meat, int price) {
        super(name, rollType, meat, price);
    }

    @Override
    public int getPrice(){
        int lettuce=2, tomatoes=2, carrots=2, pickles=2;
        return price + lettuce + tomatoes + carrots + pickles;
    }

    public void chips(int chips){
        price = chips * 5 + price;
        if(chips != 0) {
            System.out.println("Added a bag of chips");
        }
    }

    public void cola(int cola){
        price = cola * 4 + price;
        if(cola != 0) {
            System.out.println("Added a dose of coke");
        }
    }
    @Override
    public void display(){
        System.out.println("Your hamburger have the following: " +
                "\nHamburger name is: " +getName()+
                "\nRoll type is: " +getRollType()+
                "\nMeat type is: "+getMeat()+
                "\nTwo slices of lettuce"+
                "\nTwo slices of tomatoes"+
                "\nTwo slices of carrots"+
                "\nTwo slices of pickles"+
                "\nPrice is: "+getPrice()+"$");
    }
}
