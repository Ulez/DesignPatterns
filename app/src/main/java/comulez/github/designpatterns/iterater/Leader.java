package comulez.github.designpatterns.iterater;

/**
 * Created by Ulez on 2017/7/17.
 * Email：lcy1532110757@gmail.com
 */


public abstract class Leader {
    public Leader nextHandler;

    public String handleRequest(int money) {
        if (money <= limit()) {
            return handle(money);
        } else {
            if (nextHandler != null) {
               return nextHandler.handleRequest(money);
            }
            return "未通过审核";
        }
    }

    public abstract int limit();

    public abstract String handle(int money);
}
