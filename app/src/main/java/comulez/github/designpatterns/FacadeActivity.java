package comulez.github.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import comulez.github.designpatterns.facade.MobilePhone;

/**
 * 外观模式；
 */
public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        MobilePhone mobilePhone=new MobilePhone();
        mobilePhone.call();
        mobilePhone.handUp();
        mobilePhone.takePhoto();
    }
}
