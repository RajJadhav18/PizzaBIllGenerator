public class Main {
    public static void main(String[] args) {
    Pizza basePizza = new Pizza(true);
    basePizza.addExtraCheese();
    basePizza.addExtraToppings();
    basePizza.takeAway();
    basePizza.billValue();

    deluxePizza dp = new deluxePizza(false);
    dp.billValue();


    }
}