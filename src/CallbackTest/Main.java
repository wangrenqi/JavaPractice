package CallbackTest;

public class Main {



    public static void main(String[] args) {
        System.out.println("Hello World!");
        A a = new A();
        a.setCallbackListener(new B());
        a.doCallback("CallbackTest.Main String Hello");
    }



}
