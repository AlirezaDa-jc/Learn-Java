package polymorphism;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:38 PM
 */
public class Pizza extends Food {
    public String kindSausage;

    public Pizza(String ingredient, String kindSausage) {
        super(ingredient);
        this.kindSausage = kindSausage;
    }

    public String getKindSausage() {
        return kindSausage;
    }

    public void setKindSausage(String kindSausage) {
        this.kindSausage = kindSausage;
    }
}
