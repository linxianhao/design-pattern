package builder.item;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "鸡腿汉堡";
    }
}
