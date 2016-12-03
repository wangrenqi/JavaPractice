package StrategyModeTest.Demo1;


public class Main {


    public static String s = "Im a SUPPERMANE, Woohoo!!";


    public static void process(Processor p, Object s) {
        System.out.println("Using processor : " + p.name());
        System.out.println(p.process(s));

    }

    public static void main(String[] args) {
        process(new UpcaseProcessor(), s);
        process(new DowncaseProcessor(), s);
    }


}
