package comulez.github.designpatterns.facade;

import android.util.Log;

/**
 * Created by Ulez on 2017/3/28.
 * Email：lcy1532110757@gmail.com
 */

public class CameraIml implements Camera{
    @Override
    public void open() {
        Log.e("CameraIml","open");
    }

    @Override
    public void takePhoto() {
        Log.e("CameraIml","takePhoto");
    }

    @Override
    public void close() {
        Log.e("CameraIml","close");
    }
}
