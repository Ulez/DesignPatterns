package comulez.github.designpatterns;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Bind(R.id.tv_single)
    Button tvSingle;
    @Bind(R.id.tv_builder)
    Button tvBuilder;
    @Bind(R.id.tv_factory)
    Button tvFactory;
    @Bind(R.id.tv_facade)
    Button tvFacade;
    @Bind(R.id.tv_stragety)
    Button tvStragety;
    @Bind(R.id.tv_iterater)
    Button tvIterater;
    @Bind(R.id.tv_proxy)
    Button tvProxy;
    @Bind(R.id.tv_observer)
    Button tvObserver;
    @Bind(R.id.activity_main)
    LinearLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.tv_single, R.id.tv_builder, R.id.tv_factory, R.id.tv_facade, R.id.tv_stragety, R.id.tv_iterater, R.id.tv_proxy, R.id.tv_observer})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_single:
                startActivity(new Intent(this, SingleActivity.class));
                break;
            case R.id.tv_builder:
                startActivity(new Intent(this, BuilderActivity.class));
                break;
            case R.id.tv_factory:
                startActivity(new Intent(this, FactoryActivity.class));
                break;
            case R.id.tv_facade:
                startActivity(new Intent(this, FacadeActivity.class));
                break;
            case R.id.tv_stragety:
                startActivity(new Intent(this, StragetyActivity.class));
                break;
            case R.id.tv_iterater:
                startActivity(new Intent(this, IteraterActivity.class));
                break;
            case R.id.tv_proxy:
                startActivity(new Intent(this, ProxyActivity.class));
                break;
            case R.id.tv_observer:
                startActivity(new Intent(this, ObserverActivity.class));
                break;
        }
    }
}
