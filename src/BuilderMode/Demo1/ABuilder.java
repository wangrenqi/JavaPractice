package BuilderMode.Demo1;

/**
 * Created by Mccree on 23/12/2016.
 */
public class ABuilder extends Builder {
    @Override
    public void setFoodName(String name) {
        mFood.setFoodName(name);
    }

    @Override
    public void setFoodTastes(String tastes) {
        mFood.setFoodTastes(tastes);
    }

    @Override
    public void setFoodFeature(String feature) {
        mFood.setFoodFeatures(feature);
    }

    @Override
    public void addSugar(String sugar) {
        mFood.setSugar(sugar);
    }

    @Override
    public void addSalt(String salt) {
        mFood.setSalt(salt);
    }

    @Override
    public void addChillies(String chillies) {
        mFood.setChillies(chillies);
    }
}
