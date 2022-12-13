package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg==true)
            this.price=300;
        else
            this.price=400;
    }

    public int getPrice(){


        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       // if(price==300)
        price=price+80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg==true)
            price=price+70;
        else if(isVeg==false)
            price=price+120;
    }

    public void addTakeaway(){
        // your code goes here
        price=price+20;
    }

    public String getBill(){
        // your code goes here
        bill = String.valueOf(price);
        price=0;
        return this.bill;
    }
}
