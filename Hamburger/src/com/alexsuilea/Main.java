package com.alexsuilea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true){
            System.out.println("Hi, welcome to Bills Burgers! What would you like from the below menu:");
            System.out.println("1.Normal Hamburger" +
                    "\n2.Healthy Burger" +
                    "\n3.Deluxe Burger" +
                    "\n4.Exit");
            System.out.println("Please choose one number:");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            if(choose == 1){
                normalHamburgerDetails();
                System.out.println("Do you want to continue?\n1.Yes\n2.No");
                int chooseToContinueWithNewHam = scanner.nextInt();
                if(chooseToContinueWithNewHam == 2){
                    break;
                }
            } else if(choose == 2) {
                healthyHamburgerDetails();
                System.out.println("Do you want to continue?\n1.Yes\n2.No");
                int chooseToContinueWithNewHam = scanner.nextInt();
                if (chooseToContinueWithNewHam == 2) {
                    break;
                }
            } else if(choose == 3) {
                deluxeHamburgerDetails();
                System.out.println("Do you want to continue?\n1.Yes\n2.No");
                int chooseToContinueWithNewHam = scanner.nextInt();
                if (chooseToContinueWithNewHam == 2) {
                    break;
                }
            }
            else{
                break;
            }
        }
    }

    public static void normalHamburgerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select the following roll types:" +
                "\n1.Bulkie Roll" +
                "\n2.Bun" +
                "\n3.Blaa");
        int chooseRollType = scanner.nextInt();
        System.out.println("Please select the following meat types:" +
                "\n1.Pork" +
                "\n2.Beef" +
                "\n3.Chicken");
        int chooseMeatType = scanner.nextInt();
        String rollType;
        switch (chooseRollType) {
            case 1:
                rollType = "Bulkie Roll";
                break;
            case 2:
                rollType = "Bun";
                break;
            case 3:
                rollType = "Blaa";
                break;
            default:
                rollType = "None";
                break;
        }

        String meatType;
        int price;
        switch (chooseMeatType) {
            case 1:
                meatType = "Pork";
                price = 12;
                break;
            case 2:
                meatType = "Beef";
                price = 15;
                break;
            case 3:
                meatType = "Chicken";
                price = 10;
                break;
            default:
                meatType = "None";
                price = 0;
                break;
        }

        Hamburger normalHamburger = new Hamburger("Normal Hamburger",rollType, meatType, price);
        System.out.println("Do you want to add more?\n1.Yes\n2.No");
        int chooseToContinue = scanner.nextInt();
        if (chooseToContinue == 1) {
            while (true) {
                System.out.println("Please select the following additions:" +
                        "\n1.Lettuce" +
                        "\n2.Tomato" +
                        "\n3.Carrot" +
                        "\n4.Pickles" +
                        "\n5.Exit");
                int chooseAdditions = scanner.nextInt();
                switch (chooseAdditions) {
                    case 1:
                        normalHamburger.lettuce(1);
                        System.out.println("The new price is: " + normalHamburger.getPrice() + "$");
                        break;
                    case 2:
                        normalHamburger.tomato(1);
                        System.out.println("The new price is: " + normalHamburger.getPrice() + "$");
                        break;
                    case 3:
                        normalHamburger.carrot(1);
                        System.out.println("The new price is: " + normalHamburger.getPrice() + "$");
                        break;
                    case 4:
                        normalHamburger.pickles(1);
                        System.out.println("The new price is: " + normalHamburger.getPrice() + "$");
                        break;
                    default:
                        System.out.println("No additions!");
                        System.out.println("The final price is: " + normalHamburger.getPrice() + "$");
                        break;
                }

                if (chooseAdditions == 5) {
                    break;
                }
            }
        }
        else{
            return;
        }
    }

    public static void healthyHamburgerDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please note that the healthy burger has only brown rye bread roll.");
        String RollType = "Brown rye bread roll";
        System.out.println("Please select the following meat types:" +
                "\n1.Pork" +
                "\n2.Beef" +
                "\n3.Chicken");
        int chooseMeatType = scanner.nextInt();

        String meatType;
        int price;
        switch (chooseMeatType) {
            case 1:
                meatType = "Pork";
                price = 14;
                break;
            case 2:
                meatType = "Beef";
                price = 17;
                break;
            case 3:
                meatType = "Chicken";
                price = 13;
                break;
            default:
                meatType = "None";
                price = 0;
                break;
        }

        HealthyBurger healthyHamburger = new HealthyBurger("Healthy Hamburger",RollType, meatType, price);
        System.out.println("Do you want to add more?\n1.Yes\n2.No");
        int chooseToContinue = scanner.nextInt();
        if (chooseToContinue == 1) {
            while (true) {
                System.out.println("Please select the following additions:" +
                        "\n1.Lettuce" +
                        "\n2.Tomato" +
                        "\n3.Carrot" +
                        "\n4.Pickles" +
                        "\n5.Cabbage" +
                        "\n6.pepper" +
                        "\n7.Exit");
                int chooseAdditions = scanner.nextInt();
                switch (chooseAdditions) {
                    case 1:
                        healthyHamburger.lettuce(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    case 2:
                        healthyHamburger.tomato(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    case 3:
                        healthyHamburger.carrot(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    case 4:
                        healthyHamburger.pickles(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    case 5:
                        healthyHamburger.cabbage(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    case 6:
                        healthyHamburger.pepper(1);
                        System.out.println("The new price is: " + healthyHamburger.getPrice() + "$");
                        break;
                    default:
                        System.out.println("No additions!");
                        System.out.println("The final price is: " + healthyHamburger.getPrice() + "$");
                        break;
                }

                if (chooseAdditions == 7) {
                    break;
                }
            }
        }
        else{
            return;
        }
    }

    public static void deluxeHamburgerDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please note that the deluxe burger has lettuces, tomatoes, carrots and pickles already added.");
        System.out.println("Please select the following roll types:" +
                "\n1.Bulkie Roll" +
                "\n2.Bun" +
                "\n3.Blaa" +
                "\n4.Brown rye bread roll");
        int chooseRollType = scanner.nextInt();
        System.out.println("Please select the following meat types:" +
                "\n1.Pork" +
                "\n2.Beef" +
                "\n3.Chicken");
        int chooseMeatType = scanner.nextInt();

        String rollType;
        switch (chooseRollType) {
            case 1:
                rollType = "Bulkie Roll";
                break;
            case 2:
                rollType = "Bun";
                break;
            case 3:
                rollType = "Blaa";
                break;
            case 4:
                rollType = "Brown rye bread roll";
                break;
            default:
                rollType = "None";
                break;
        }

        String meatType;
        int price;
        switch (chooseMeatType) {
            case 1:
                meatType = "Pork";
                price = 14;
                break;
            case 2:
                meatType = "Beef";
                price = 17;
                break;
            case 3:
                meatType = "Chicken";
                price = 13;
                break;
            default:
                meatType = "None";
                price = 0;
                break;
        }

        DeluxeBurger deluxeBurger = new DeluxeBurger("Deluxe Hamburger",rollType, meatType, price);
        System.out.println("Do you want to add more?\n1.Yes\n2.No");
        int chooseToContinue = scanner.nextInt();
        if (chooseToContinue == 1) {
            while (true) {
                System.out.println("Please select the following additions:" +
                        "\n1.Chips" +
                        "\n2.Cola" +
                        "\n3.Exit");
                int chooseAdditions = scanner.nextInt();
                switch (chooseAdditions) {
                    case 1:
                        deluxeBurger.chips(1);
                        System.out.println("The new price is: " + deluxeBurger.getPrice() + "$");
                        break;
                    case 2:
                        deluxeBurger.cola(1);
                        System.out.println("The new price is: " + deluxeBurger.getPrice() + "$");
                        break;
                    default:
                        System.out.println("No additions!");
                        System.out.println("The final price is: " + deluxeBurger.getPrice() + "$");
                        break;
                }

                if (chooseAdditions == 3) {
                    break;
                }
            }
        }
        else{
            return;
        }
    }
}
