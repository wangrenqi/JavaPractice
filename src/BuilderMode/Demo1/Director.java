package BuilderMode.Demo1;

/**
 * Created by Mccree on 23/12/2016.
 */
public class Director {
    private Builder mBuilder;

    public Director(){}


    public Director(Builder builder) {
        mBuilder = builder;
    }


    public void setDirector(Builder builder) {
        mBuilder = builder;
    }


    public Food construct(String name, String feature, String taste, String chillies, String salt, String sugar) {
        mBuilder.setFoodName(name);
        mBuilder.setFoodFeature(feature);
        mBuilder.setFoodTastes(taste);
        mBuilder.addChillies(chillies);
        mBuilder.addSalt(salt);
        mBuilder.addSalt(sugar);
        return mBuilder.getResult();
    }



}
