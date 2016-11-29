package ButtonTest;

/**
 * Created by Mccree on 24/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        Button b = new Button();
//        b.setPrinterLisnter(new Printer());
//        b.tellPrinterDoPrint("main string");
        b.setOnClickListenrer(new Button.OnClickListener(){
            @Override
            public void onClick() {
                doSomething();
            }
        });
    }

    public static void doSomething(){
        System.out.println("doSomething()");
    }
}
