package comulez.github.designpatterns.stragety;

/**
 * Created by Ulez on 2017/4/24.
 * Email：lcy1532110757@gmail.com
 */

public class MyContex {
    private Stragety stragety;

    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

    public String get(int dis){
        return stragety.calculatePrice(dis);
    }
}
