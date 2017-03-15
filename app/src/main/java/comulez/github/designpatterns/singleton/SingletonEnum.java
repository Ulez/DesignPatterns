package comulez.github.designpatterns.singleton;

/**
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public enum SingletonEnum implements MakeInfo {
    SINGLETON_ENUM {
        @Override
        public String getInfo() {
            return "枚举实现单例:SingletonEnum";
        }
    };
}
