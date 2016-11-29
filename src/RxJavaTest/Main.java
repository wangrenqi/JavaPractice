package RxJavaTest;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * Created by Mccree on 29/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println(integer);
            }
        });


        //map
        //Func1构造函数中的两个参数分别是Observable发射值当前的类型和map转换后的类型，
        //例子中发射值当前的类型是Integer,转换后的类型是String。
        Observable.create(new Observable.OnSubscribe<Integer>() {
            @Override
            public void call(Subscriber<? super Integer> subscriber) {
                for (int i = 0; i < 5; i++) {
                    subscriber.onNext(i);
                }
            }
        }).map(new Func1<Integer, String>() {
            @Override
            public String call(Integer integer) {
                return "integer: " + integer;
            }
        }).subscribe(new Observer<String>(){

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onNext(String s) {

                System.out.println(s);
            }
        });









    }

}
