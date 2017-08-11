package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import comulez.github.designpatterns.observer.Coder;
import comulez.github.designpatterns.observer.News;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);

        Coder coder1 = new Coder("Coder1");
        Coder coder2 = new Coder("Coder2");
        Coder coder3 = new Coder("Coder3");
        Coder coder4 = new Coder("Coder4");

        News news = new News();

        //添加观察者；
        news.addObserver(coder1);
        news.addObserver(coder2);
        news.addObserver(coder3);
        news.addObserver(coder4);

        news.postNews("新一期报纸发布了！！");
    }
}
