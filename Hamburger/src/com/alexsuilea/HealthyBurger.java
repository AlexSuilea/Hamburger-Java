package com.alexsuilea;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String name, String rollType, String meat, int price) {
        super(name, rollType, meat, price);
    }

    public void cabbage(int cabbage){
        price = cabbage * 2 + price;
        if(cabbage != 0) {
            System.out.println("Added two slices of cabbage");
        }
    }

    public void pepper(int pepper){
        price = pepper * 2 + price;
        if(pepper != 0) {
            System.out.println("Added two slices of pepper");
        }
    }
    @Override
    public void display(){
        System.out.println("Your hamburger have the following: " +
                "\nHamburger name is: " +getName()+
                "\nRoll type is: " +getRollType()+
                "\nMeat type is: "+getMeat()+
                "\nPrice is: "+getPrice()+"$");
    }
}
