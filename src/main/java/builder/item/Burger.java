package builder.item;

import builder.packing.Packing;
import builder.packing.Wrapper;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
