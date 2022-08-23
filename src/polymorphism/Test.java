package polymorphism;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:37 PM
 */
public class Test {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Cheese", "Pepperoni");
        Sushi sushi = new Sushi("fish" , "Salmon");
        showIngredients(pizza);
        showIngredients(sushi);
//        Food pizza1 = new Pizza("Cheese" , "Pepperoni");
//        Food sushi1 = new Sushi("fish" , "Salmon");
//        showIngredients(pizza1);
//        showIngredients(sushi1);
    }

    /* Food -> Pizza
        Pizza !-> Food
    */

    private static void showIngredients(Food pizza1) {
        pizza1.showIngredients();
    }


}
