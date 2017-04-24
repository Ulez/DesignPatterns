package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import comulez.github.designpatterns.stragety.MyContex;
import comulez.github.designpatterns.stragety.StragetyA;
import comulez.github.designpatterns.stragety.StragetyB;

/**
 * 策略模式
 */
public class StragetyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stragety);
        TextView textViewA = (TextView) findViewById(R.id.tv_stragetyA);
        TextView textViewB = (TextView) findViewById(R.id.tv_stragetyB);
        MyContex contex = new MyContex();
        contex.setStragety(new StragetyA());
        textViewA.setText(contex.get(4));

        MyContex contex2 = new MyContex();
        contex2.setStragety(new StragetyB());
        textViewB.setText(contex2.get(6));
    }
}
