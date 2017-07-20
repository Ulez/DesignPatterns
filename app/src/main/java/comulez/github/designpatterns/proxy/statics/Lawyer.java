package comulez.github.designpatterns.proxy.statics;

/**
 * Created by Ulez on 2017/7/20.
 * Email：lcy1532110757@gmail.com
 */


public class Lawyer implements ILawsuit{

    private ILawsuit xiaoming;//被代理的小民；

    public Lawyer(ILawsuit xiaoming) {
        this.xiaoming = xiaoming;
    }

    @Override
    public String submit() {
        return xiaoming.submit();
    }

    @Override
    public String burden() {
        return xiaoming.burden();
    }

    @Override
    public String defend() {
        return xiaoming.defend();
    }

    @Override
    public String finish() {
        return xiaoming.finish();
    }
}
