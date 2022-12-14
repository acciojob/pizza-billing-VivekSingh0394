package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
     private int extraCheesePrice;
     private int extraToppingsPrice;
     private int paperBagPrice;
     private boolean isExtraCheesesAdded=false;
     private boolean isExtraToppingAdded=false;

     private boolean isPaperBagAdded=false;
     private boolean isBillGenerated=false;

     public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
         this.extraCheesePrice=80;
         this.paperBagPrice=20;

         if(isVeg==true)
         {
             this.extraToppingsPrice=70;
             this.price=300;
         }
         else {
             this.extraToppingsPrice=120;
             this.price=400;
         }
         this.bill= "Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
     if(isExtraCheesesAdded == false)
     {
         this.price=this.price + this.extraCheesePrice;
         isExtraCheesesAdded = true;
     }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isExtraToppingAdded == false)
        {

                this.price=this.price + this.extraToppingsPrice;
                isExtraToppingAdded = true;

        }

    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperBagAdded == false)
        {
            this.price=this.price + this.paperBagPrice;
            isPaperBagAdded = true;
        }

    }

    public String getBill(){
        // your code goes here
      if(isBillGenerated == false)
      {
          isBillGenerated = true;
          if(isExtraCheesesAdded == true)
         this.bill = this.bill + "Extra Cheese Added: "+this.extraCheesePrice+"\n";

          if(isExtraToppingAdded == true)
              this.bill = this.bill + "Extra Toppings Added: "+this.extraToppingsPrice+"\n";
         if(isPaperBagAdded == true)
             this.bill = this.bill +"Paperbag Added: "+this.paperBagPrice+"\n";

          this.bill = this.bill+"Total Price: "+this.price+"\n";

      }
        return this.bill;
    }
}
