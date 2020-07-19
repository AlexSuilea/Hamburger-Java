package com.alexsuilea;

public class Hamburger {
    protected String name;
    private String rollType;
    private String meat;
    protected int price;

    public Hamburger(String name, String rollType, String meat,int price) {
        this.name = name;
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        display();
    }

    public String getName() {
        return name;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public int getPrice() {
        return price;
    }

    public void lettuce(int lettuce){
       price = lettuce * 2 + price;
        if(lettuce != 0) {
            System.out.println("Added two slices of lettuces");
        }
    }

    public void tomato(int tomato){
        price = tomato * 2 + price;
        if(tomato != 0) {
            System.out.println("Added two slices of tomatoes");
        }
    }

    public void carrot(int carrot){
        price = carrot * 2 + price;
        if(carrot != 0) {
            System.out.println("Added two slices of carrots");
        }
    }

    public void pickles(int pickles){
        price = pickles * 2 + price;
        if(pickles != 0) {
            System.out.println("Added two slices of pickles");
        }
    }

    public void display(){
        System.out.println("Your hamburger have the following: " +
                "\nHamburger name is: " +getName()+
                "\nRoll type is: " +getRollType()+
                "\nMeat type is: "+getMeat()+
                "\nPrice is: "+getPrice()+"$");
    }
}
