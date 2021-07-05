package builder.item;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public class Coke extends Drink {
    @Override
    public float price() {
        return 30;
    }

    public String name() {
        return "可口可乐";
    }
}
