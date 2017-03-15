package comulez.github.designpatterns.singleton;

/**
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public class SingletonStatic implements MakeInfo{
    private SingletonStatic() {
    }

    public static SingletonStatic getInstance() {
        return SingletonStaticHolder.instance;
    }

    @Override
    public String getInfo() {
        return "静态内部类实现单例：SingletonStatic";
    }

    private static class SingletonStaticHolder {
        public static final SingletonStatic instance = new SingletonStatic();
    }
}
