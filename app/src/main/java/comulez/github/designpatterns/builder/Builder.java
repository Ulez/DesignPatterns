package comulez.github.designpatterns.builder;

/**
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public abstract class Builder {
    public abstract Builder setHeroName(String heroName);

    public abstract Builder setEquipment1(String equipment1);

    public abstract Builder setEquipment2(String equipment2);

    public abstract Builder setEquipment3(String equipment3);

    public abstract Builder setEquipment4(String equipment4);

    public abstract Builder setEquipment5(String equipment5);

    public abstract Builder setEquipment6(String equipment6);

    public abstract Hero create();
}
