package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import comulez.github.designpatterns.builder.Hero;

public class BuilderActivity extends AppCompatActivity {

    TextView tvDota;
    TextView tvLol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        tvDota = (TextView) findViewById(R.id.tv_dota);
        tvLol = (TextView) findViewById(R.id.tv_lol);
        Hero heroDota = new Hero.HeroBuilder()
                .setHeroName("灰烬之灵")
                .setEquipment1("代达罗斯之殇")
                .setEquipment2("林肯法球")
                .setEquipment3("远行鞋")
                .setEquipment4("狂战斧")
                .setEquipment5("跳刀")
                .setEquipment6("圣剑")
                .create();

        Hero heroLOL = new Hero.HeroBuilder()
                .setHeroName("疾风剑豪")
                .setEquipment1("无尽之刃")
                .setEquipment2("三相之力")
                .setEquipment3("饮血剑")
                .setEquipment4("攻速鞋")
                .setEquipment5("复活甲")
                .setEquipment6("电刀")
                .create();
        tvDota.setText(heroDota.toString());
        tvLol.setText(heroLOL.toString());
    }
}
