package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import comulez.github.designpatterns.iterater.Boss;
import comulez.github.designpatterns.iterater.GroupLeader;
import comulez.github.designpatterns.iterater.Leader;
import comulez.github.designpatterns.iterater.Manager;

public class IteraterActivity extends AppCompatActivity {

    @Bind(R.id.et_money)
    EditText etMoney;
    @Bind(R.id.bt_request)
    Button btRequest;
    @Bind(R.id.tv_result)
    TextView tvResult;
    private Leader groupLeader;
    private Leader manager;
    private Leader boss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterater);
        ButterKnife.bind(this);
        groupLeader = new GroupLeader();
        manager = new Manager();
        boss = new Boss();
        groupLeader.nextHandler= manager;
        manager.nextHandler= boss;
    }

    @OnClick(R.id.bt_request)
    public void onClick() {
        tvResult.setText(groupLeader.handleRequest(Integer.valueOf(etMoney.getText().toString())));
    }
}
