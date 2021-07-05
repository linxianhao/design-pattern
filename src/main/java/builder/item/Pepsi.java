package builder.item;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public class Pepsi extends Drink {
    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "百事可乐";
    }
}
