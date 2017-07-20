package comulez.github.designpatterns.proxy.statics;

/**
 * Created by Ulez on 2017/7/20.
 * Email：lcy1532110757@gmail.com
 */


public class XiaoMing implements ILawsuit{
    @Override
    public String submit() {
        return "XiaoMing提交诉讼";
    }

    @Override
    public String burden() {
        return "XiaoMing-burden";
    }

    @Override
    public String defend() {
        return "XiaoMing-defend";
    }

    @Override
    public String finish() {
        return "XiaoMing--finish";
    }
}
