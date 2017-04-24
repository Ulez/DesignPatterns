package comulez.github.designpatterns.stragety;

/**
 * Created by Ulez on 2017/4/24.
 * Email：lcy1532110757@gmail.com
 */

public class StragetyA implements Stragety {
    @Override
    public String calculatePrice(int distance) {
        if (distance < 5)
            return "StragetyA,distance<5" + "：10元";
        else if (distance < 10)
            return "StragetyA,distance<10" + "：20元";
        else
            return "StragetyA,distance>=10" + "：xx元";
    }
}
