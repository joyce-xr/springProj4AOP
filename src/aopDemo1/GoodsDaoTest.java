package aopDemo1;

import org.junit.Test;

public class GoodsDaoTest {

    @Test
    public void test(){
        GoodsDao goodsDao = new GoodsDaoImpl();

        GoodsJDKProxy goodsJDKProxy = new GoodsJDKProxy();//创建代理类
        GoodsDao goodsProxy = goodsJDKProxy.createProxy(goodsDao);//（指定类型）创建代理对象
        goodsProxy.save();
        goodsProxy.update();
    }
}
