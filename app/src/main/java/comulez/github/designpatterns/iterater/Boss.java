package comulez.github.designpatterns.iterater;

import android.util.Log;

/**
 * Created by Ulez on 2017/7/17.
 * Email：lcy1532110757@gmail.com
 */


public class Boss extends Leader{
    @Override
    public int limit() {
        return 50000;
    }

    @Override
    public String handle(int money) {
        String result="老板审核通过"+money+"元";
        Log.e("Boss",result);
        return result;
    }
}
