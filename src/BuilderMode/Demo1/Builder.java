package BuilderMode.Demo1;

/**
 * Created by Mccree on 23/12/2016.
 */
public abstract class Builder {
    protected Food mFood = new Food();

    public abstract void setFoodName(String name);

    public abstract void setFoodTastes(String tastes);

    public abstract void setFoodFeature(String feature);

    public abstract void addSugar(String sugar);

    public abstract void addSalt(String salt);

    public abstract void addChillies(String chillies);

    public Food getResult(){
        return mFood;
    }

}
