package polymorphism;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:38 PM
 */
public class Sushi extends Food {
    public String kindFish;

    public Sushi(String ingredient, String kindFish) {
        super(ingredient);
        this.kindFish = kindFish;
    }

    public void setKindFish(String kindFish) {
        this.kindFish = kindFish;
    }

    public String getKindFish() {
        return kindFish;
    }
}
