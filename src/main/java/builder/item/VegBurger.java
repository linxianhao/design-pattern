package builder.item;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25;
    }

    public String name() {
        return "蔬菜汉堡包";
    }
}
