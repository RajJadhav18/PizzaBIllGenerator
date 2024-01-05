public class Pizza {
    private int price;

    private boolean veg;

    private int extraCheesePrice=100;
    private int extraToppingsPrice=150;
    private int takeawayPrice=20;
    private int basePizzaPrice;
    private boolean isextraCheeseAdded=false;
    private boolean isextraToppingsAdded=false;
    private boolean istakeaway=false;



    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price=300;
        }
        else this.price=400;

        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        isextraCheeseAdded=true;
        //System.out.println("Extra Cheese added");
        this.price+=extraCheesePrice;

    }
    public void addExtraToppings(){
        isextraToppingsAdded=true;
       // System.out.println("Extra Toppings Added");
        this.price+=extraToppingsPrice;
    }

    public void takeAway(){
        istakeaway=true;
       // System.out.println("Take away opted");
        this.price+=takeawayPrice;
    }

    public void billValue(){
        String bill="";
        System.out.println("Base Pizza = "+ basePizzaPrice);

        if (isextraCheeseAdded){
            bill+="Extra Cheese Added : "+extraCheesePrice+ "\n";
        }

        if (isextraToppingsAdded){
            bill+="Extra Cheese Added : "+extraToppingsPrice+ "\n";
        }

        if (istakeaway){
            bill+="Extra Cheese Added : "+takeawayPrice+ "\n";
        }

        bill+="Bill = "+this.price+"\n";
        System.out.println(bill);
    }






//    public void getPizzaValue(){
//        System.out.println(this.price);
//    }
}
