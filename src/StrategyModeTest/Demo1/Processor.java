package StrategyModeTest.Demo1;

/**
 * Created by Mccree on 03/12/2016.
 */
public class Processor {

    public String name(){
        return getClass().getName();
    }


    public Object process(Object input) {
        return input;
    }
}
