package builder.item;

import builder.packing.Bottle;
import builder.packing.Packing;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public abstract class Drink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
