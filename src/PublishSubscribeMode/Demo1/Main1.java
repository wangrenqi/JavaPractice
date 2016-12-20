package PublishSubscribeMode.Demo1;

/**
 * Created by Mccree on 20/12/2016.
 */
public class Main1 {

    public static void main(String[] args) {

        Person p = new Person();
        Water w = new Water();

        w.addSubscriber(p);
        w.setBoiled();
    }


    //Subscriber
    static class Person{
        public void update(String str) {
            System.out.println(str + " ......");
        }
    }

    //Publisher
    static class Water {
        private Person person;
        private Boolean isBoiled;

        public Water() {
            isBoiled = false;
        }

        public void setBoiled() {
            isBoiled = true;
            notifySubscriber();
        }

        private void notifySubscriber() {
            if (isBoiled && person != null) {
                person.update("boiled!!");
                isBoiled = false;
            }
        }

        public void addSubscriber(Person person) {
            this.person = person;
        }
        public void removeSubscriber() {
            if (person != null) {
                person = null;
            }
        }

    }


}
