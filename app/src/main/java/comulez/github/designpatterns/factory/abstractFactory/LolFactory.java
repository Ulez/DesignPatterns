package comulez.github.designpatterns.factory.abstractFactory;

/**
 * Created by Ulez on 2017/3/16.
 * Email：lcy1532110757@gmail.com
 */

public class LolFactory extends EquipmentFactory{
    @Override
    public Equipment createEquipment() {
        return new LolEquipment();
    }
}
