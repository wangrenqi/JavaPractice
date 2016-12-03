package StrategyModeTest.Demo1;

/**
 * Created by Mccree on 03/12/2016.
 */
public class UpcaseProcessor extends Processor {
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
