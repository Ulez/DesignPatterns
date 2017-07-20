package comulez.github.designpatterns.proxy.dynamic;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Ulez on 2017/7/20.
 * Email：lcy1532110757@gmail.com
 */


public class DynamicProxy implements InvocationHandler{
    private Object object;//被代理的小民；

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(object,args);
        Log.e("DynamicProxy,invoke","object="+object.getClass().getName()+",args="+args);
        return result;
    }
}
