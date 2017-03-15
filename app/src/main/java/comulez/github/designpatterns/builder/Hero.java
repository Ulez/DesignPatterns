package comulez.github.designpatterns.builder;

/**
 * 玩家操控的英雄
 * Created by Ulez on 2017/3/15.
 * Email：lcy1532110757@gmail.com
 */

public  class Hero {
    protected String heroName;
    protected String equipment1;
    protected String equipment2;
    protected String equipment3;
    protected String equipment4;
    protected String equipment5;
    protected String equipment6;




    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public void setEquipment1(String equipment1) {
        this.equipment1 = equipment1;
    }

    public void setEquipment2(String equipment2) {
        this.equipment2 = equipment2;
    }

    public void setEquipment3(String equipment3) {
        this.equipment3 = equipment3;
    }

    public void setEquipment4(String equipment4) {
        this.equipment4 = equipment4;
    }

    public void setEquipment5(String equipment5) {
        this.equipment5 = equipment5;
    }

    public void setEquipment6(String equipment6) {
        this.equipment6 = equipment6;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroName='" + heroName + '\'' +
                ", equipment1='" + equipment1 + '\'' +
                ", equipment2='" + equipment2 + '\'' +
                ", equipment3='" + equipment3 + '\'' +
                ", equipment4='" + equipment4 + '\'' +
                ", equipment5='" + equipment5 + '\'' +
                ", equipment6='" + equipment6 + '\'' +
                '}';
    }
}
