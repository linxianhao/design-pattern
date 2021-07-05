package builder.item;

import builder.packing.Packing;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
