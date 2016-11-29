package ButtonTest;

/**
 * Created by Mccree on 24/11/2016.
 */
public class Printer implements OnButtonClick {



    @Override
    public void onClick(String s) {
        doPrint(s);
    }

    private void doPrint(String s) {
        System.out.println("printer do print \n");
        System.out.println(s);
    }
}
