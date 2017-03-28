package comulez.github.designpatterns.facade;

/**
 * Created by Ulez on 2017/3/28.
 * Email：lcy1532110757@gmail.com
 * 统一调用类；对外隐藏具体实现，用户不必知道具体细节，直接调用。
 */

public class MobilePhone {
    private Camera camera = new CameraIml();
    private Phone phone = new PhoneIml();
    public void call(){
        phone.call();
    }
    public void handUp(){
        phone.handUp();
    }
    public void takePhoto(){
        camera.open();
        camera.takePhoto();
    }
}
