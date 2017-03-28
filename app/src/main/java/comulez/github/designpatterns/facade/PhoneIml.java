package comulez.github.designpatterns.facade;

import android.util.Log;

/**
 * Created by Ulez on 2017/3/28.
 * Email：lcy1532110757@gmail.com
 */

public class PhoneIml implements Phone{
    @Override
    public void call() {
        Log.e("PhoneIml","call");
    }

    @Override
    public void handUp() {
        Log.e("PhoneIml","handUp");
    }
}
