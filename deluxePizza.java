public class deluxePizza extends Pizza {

    public deluxePizza(boolean veg) {

        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    

    @Override
    public void addExtraCheese() {
       // super.addExtraCheese(); empty methods so they won't get added again
    }

    @Override
    public void addExtraToppings() {
        //super.addExtraToppings();
    }
}
