package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import comulez.github.designpatterns.factory.abstractFactory.DotaFactory;
import comulez.github.designpatterns.factory.abstractFactory.Equipment;
import comulez.github.designpatterns.factory.abstractFactory.LolFactory;
import comulez.github.designpatterns.factory.simpleFactory.BookProduct;
import comulez.github.designpatterns.factory.Factory;

public class FactoryActivity extends AppCompatActivity {

    private TextView tvSimp;
    private TextView tvAbs1;
    private TextView tvAbs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        tvSimp = (TextView) findViewById(R.id.tv_simp);
        tvAbs1 = (TextView) findViewById(R.id.tv_abs1);
        tvAbs2 = (TextView) findViewById(R.id.tv_abs2);
        BookProduct bookProduct = new Factory().createProduct(BookProduct.class);
        tvSimp.setText(bookProduct.getInfo());
        Equipment lol = new LolFactory().createEquipment();
        Equipment dota = new DotaFactory().createEquipment();
        tvAbs1.setText(lol.getEffectInfo() + "--" + lol.getEffectCD());
        tvAbs2.setText(dota.getEffectInfo() + "--" + dota.getEffectCD());
    }
}
