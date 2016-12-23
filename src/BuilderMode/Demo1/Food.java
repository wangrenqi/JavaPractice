package BuilderMode.Demo1;

/**
 * Created by Mccree on 23/12/2016.
 */
public class Food {
    private String foodName;
    private String foodTastes;
    private String foodFeatures;
    private String chillies;
    private String sugar;
    private String salt;

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                ", foodTastes='" + foodTastes + '\'' +
                ", foodFeatures='" + foodFeatures + '\'' +
                ", chillies='" + chillies + '\'' +
                ", sugar='" + sugar + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodTastes() {
        return foodTastes;
    }

    public void setFoodTastes(String foodTastes) {
        this.foodTastes = foodTastes;
    }

    public String getFoodFeatures() {
        return foodFeatures;
    }

    public void setFoodFeatures(String foodFeatures) {
        this.foodFeatures = foodFeatures;
    }

    public String getChillies() {
        return chillies;
    }

    public void setChillies(String chillies) {
        this.chillies = chillies;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
