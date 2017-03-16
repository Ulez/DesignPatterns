package comulez.github.designpatterns.factory.abstractFactory;

/**
 * Created by Ulez on 2017/3/16.
 * Email：lcy1532110757@gmail.com
 */

public class LolEquipment implements Equipment {
    @Override
    public String getEffectInfo() {
        return "装备效果：LolEquipment";
    }

    @Override
    public String getEffectCD() {
         return "装备CD：45秒";
    }
}
