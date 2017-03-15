package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import comulez.github.designpatterns.R;
import comulez.github.designpatterns.singleton.SingletonDCL;
import comulez.github.designpatterns.singleton.SingletonEnum;
import comulez.github.designpatterns.singleton.SingletonStatic;

public class SingleActivity extends AppCompatActivity {

    TextView tvDcl;
    TextView tvStatic;
    TextView tvEnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single);
        tvDcl = (TextView) findViewById(R.id.tv_dcl);
        tvStatic = (TextView) findViewById(R.id.tv_static);
        tvEnum = (TextView) findViewById(R.id.tv_enum);
        tvDcl.setText(SingletonDCL.getInstance().getInfo());
        tvStatic.setText(SingletonStatic.getInstance().getInfo());
        tvEnum.setText(SingletonEnum.SINGLETON_ENUM.getInfo());
    }
}
