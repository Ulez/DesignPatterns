package comulez.github.designpatterns.stragety;

/**
 * Created by Ulez on 2017/4/24.
 * Email：lcy1532110757@gmail.com
 */

public class StragetyB implements Stragety {
    @Override
    public String calculatePrice(int distance) {
        if (distance < 5)
            return "StragetyB,distance<5" + "：10元";
        else if (distance < 10)
            return "StragetyB,distance<10" + "：20元";
        else
            return "StragetyB,distance>=10" + "：xx元";
    }
}
