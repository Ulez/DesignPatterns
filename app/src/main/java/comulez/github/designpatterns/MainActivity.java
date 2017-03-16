package comulez.github.designpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btSingle;
    Button btBuilder;
    private Button btFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSingle = (Button) findViewById(R.id.tv_single);
        btBuilder = (Button) findViewById(R.id.tv_builder);
        btFactory = (Button) findViewById(R.id.tv_factory);

        btSingle.setOnClickListener(this);
        btBuilder.setOnClickListener(this);
        btFactory.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_single:
                startActivity(new Intent(this, SingleActivity.class));
                break;
            case R.id.tv_builder:
                startActivity(new Intent(this, BuilderActivity.class));
                break;
            case R.id.tv_factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
        }
    }
}
