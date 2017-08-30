package comulez.github.designpatterns.proxy.statics.demo1;

import android.os.Build;

/**
 * <pre>
 *     @author guoping_wu
 *     @since 2017/08/30 09:22
 *     @version v1.0
 *     Desc     静态代理的应用场景一
 * </pre>
 */
public class NotificationProxy implements INotification {
    private INotification mNotification;

    public NotificationProxy() {
       if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
           mNotification = new FitKitkatNotification();
       } else if (isMiRom()) {
           mNotification = new FitXiaoMiNotification();
       } else {
           mNotification = new Notification();
       }
    }

    @Override
    public void show() {
        mNotification.show();
    }

    @Override
    public void hide() {
        mNotification.hide();
    }

    private boolean isMiRom() {
        return true;
    }

}
