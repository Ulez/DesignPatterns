package comulez.github.designpatterns.builder;

/**
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public class HeroBuilder extends Builder {
    private Hero hero = new Hero();

    @Override
    public Builder setHeroName(String heroName) {
        hero.setHeroName(heroName);
        return this;
    }

    @Override
    public Builder setEquipment1(String equipment1) {
        hero.setEquipment1(equipment1);
        return this;
    }

    @Override
    public Builder setEquipment2(String equipment2) {
        hero.setEquipment2(equipment2);
        return this;
    }

    @Override
    public Builder setEquipment3(String equipment3) {
        hero.setEquipment3(equipment3);
        return this;
    }

    @Override
    public Builder setEquipment4(String equipment4) {
        hero.setEquipment4(equipment4);
        return this;
    }

    @Override
    public Builder setEquipment5(String equipment5) {
        hero.setEquipment5(equipment5);
        return this;
    }

    @Override
    public Builder setEquipment6(String equipment6) {
        hero.setEquipment6(equipment6);
        return this;
    }

    @Override
    public Hero create() {
        return hero;
    }
}
