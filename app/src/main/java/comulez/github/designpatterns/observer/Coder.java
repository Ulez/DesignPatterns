package comulez.github.designpatterns.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;


/**
 * Created by Ulez on 2017/8/11.
 * Email：lcy1532110757@gmail.com
 */


public class Coder implements Observer {//观察者；
    public String name;
    public static final String TAG = "Coder";

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e(TAG, "Observable=" + name + ",arg=" + arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
