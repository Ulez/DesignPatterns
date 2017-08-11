package comulez.github.designpatterns.observer;

import java.util.Observable;

/**
 * Created by Ulez on 2017/8/11.
 * Email：lcy1532110757@gmail.com
 */


public class News extends Observable{//被观察者
    public void postNews(String content){
        setChanged();
        notifyObservers(content);
    }
}
