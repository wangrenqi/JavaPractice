package GenericsTest;

/**
 * Created by Mccree on 30/11/2016.
 */
public class MyContainer<K, V> {
    private K key;
    private V value;

    public MyContainer(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public static void main(String[] args) {
        MyContainer<String, String> c1 = new MyContainer<>("name", "Mccree");
        MyContainer<String, Integer> c2 = new MyContainer<>("key", 100);
        MyContainer<Double, Double> c3 = new MyContainer<>(1.1, 2.2);
        System.out.println(c1.getKey() + "  " + c1.getValue());
        System.out.println(c2.getKey() + "  " + c2.getValue());
        System.out.println(c3.getKey() + "   " + c3.getValue());
    }


}
