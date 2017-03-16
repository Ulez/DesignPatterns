package comulez.github.designpatterns.factory;


import comulez.github.designpatterns.factory.simpleFactory.Product;

/**
 * Created by Ulez on 2017/3/16.
 * Email：lcy1532110757@gmail.com
 */

public  class Factory {
    /**
     * 传入不同的类名，产生不同的对象。
     * @param clazz
     * @param <T>
     * @return
     */
    public  <T extends Product> T createProduct(Class<T> clazz){
        T t = null;
        try {
            t = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    } ;

}
