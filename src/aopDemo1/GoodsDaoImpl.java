package aopDemo1;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public void save() {
        System.out.println("GoodsDaoImpl.保存");
    }

    @Override
    public String update() {
        System.out.println("GoodsDaoImpl.更新");
        return "update----res";
    }

    @Override
    public void delete() {
        System.out.println("oodsDaoImpl.删除");
        //int i = 1/0;
    }
}
