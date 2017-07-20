package comulez.github.designpatterns.proxy.statics;

/**
 * Created by Ulez on 2017/7/20.
 * Email：lcy1532110757@gmail.com
 */


public interface ILawsuit {
    //提交诉讼
    String submit();

    //举证
    String burden();

    //辩护
    String defend();

    //结束；
    String finish();
}
