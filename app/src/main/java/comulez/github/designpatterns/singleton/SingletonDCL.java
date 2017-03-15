package comulez.github.designpatterns.singleton;

/**
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public class SingletonDCL implements MakeInfo {
    private static SingletonDCL singletonDCL;

    private SingletonDCL() {

    }

    public static SingletonDCL getInstance() {
        if (singletonDCL == null) {
            synchronized (SingletonDCL.class) {
                if (singletonDCL == null) {
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }


    @Override
    public String getInfo() {
        return "Double Check Lock实现单例：SingletonStatic";
    }
}
