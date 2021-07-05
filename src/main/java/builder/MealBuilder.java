package builder;

import builder.item.ChickenBurger;
import builder.item.Coke;
import builder.item.Pepsi;
import builder.item.VegBurger;

/**
 * @author: lxh
 * @date:2021/7/5
 * @description
 **/
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
