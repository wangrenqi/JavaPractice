package StrategyModeTest.Demo2;

/**
 * Created by Mccree on 03/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        getHero(new Hero1());
        getHero(new Hero2());
    }

    private static void getHero(Skill skill) {
        System.out.println(skill.getClass() + " -> " + skill.base());

    }
}
