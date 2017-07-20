package comulez.github.designpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.lang.reflect.Proxy;

import butterknife.Bind;
import butterknife.ButterKnife;
import comulez.github.designpatterns.proxy.dynamic.DynamicProxy;
import comulez.github.designpatterns.proxy.statics.ILawsuit;
import comulez.github.designpatterns.proxy.statics.Lawyer;
import comulez.github.designpatterns.proxy.statics.XiaoMing;

public class ProxyActivity extends AppCompatActivity {
    /**
     * 总结：被代理者和代理者的实现的功能是一样的，所以抽象出一个接口。被代理者不会直接干活，需要代理者去干活，所以代理者持有被代理者的引用对象，去执行函数。
     */

    @Bind(R.id.tv_process_static)
    TextView tvProcessStatic;
    @Bind(R.id.tv_process_dynamic)
    TextView tvProcessDynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);
        ButterKnife.bind(this);
        XiaoMing xiaoMing = new XiaoMing();

        Lawyer lawyer = new Lawyer(xiaoMing);
        String process = lawyer.submit() + lawyer.burden() + lawyer.defend() + lawyer.finish();
        tvProcessStatic.setText("静态代理-" + process);


        DynamicProxy dynamicProxy = new DynamicProxy(xiaoMing);

        ClassLoader loader = xiaoMing.getClass().getClassLoader();
        ILawsuit iLawsuit = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, dynamicProxy);//传入被代理类的loader，接口，InvocationHandler处理分发的方法调用；
        // 1、类加载器（ClassLoader）用来加载动态代理类。 2、一个要实现的接口的数组。 3、一个 InvocationHandler 把所有方法的调用都转到代理上。
        String process2 = iLawsuit.submit() + iLawsuit.burden() + iLawsuit.defend() + iLawsuit.finish();
        tvProcessDynamic.setText("动态代理-" + process2);
    }
}
