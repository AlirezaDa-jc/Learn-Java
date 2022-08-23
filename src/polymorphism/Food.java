package polymorphism;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:38 PM
 */
public class Food {
    private String ingredient;

    public Food(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public void showIngredients() {
        System.out.println(ingredient);
    }
}
