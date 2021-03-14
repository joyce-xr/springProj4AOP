package aopDemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GoodsJDKProxy {

    //根据参数指定对象创建代理类
    public GoodsDao createProxy(GoodsDao goodsDao){
        GoodsDao goodsDaoProxy = (GoodsDao) Proxy.newProxyInstance(goodsDao.getClass().getClassLoader(), goodsDao.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //通过代理对象调用GoodsDao方法时，都会执行这里
                System.out.println("执行代理对象的invoke方法");
                if ("save".equals(method.getName())){
                    System.out.println("--------权限校验----------");
                }
                GoodsDao goodProxy = (GoodsDao) method.invoke(goodsDao,args);

                System.out.println("方法执行后添加日志");
                return goodProxy;
            }
        });

        return goodsDaoProxy;
    }
}
