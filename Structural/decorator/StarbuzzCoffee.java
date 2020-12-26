package tommy.mydesignpatterns.b_decorator;

import android.util.Log;

import tommy.mydesignpatterns.b_decorator.condiment_decorator.Milk;
import tommy.mydesignpatterns.b_decorator.condiment_decorator.Mocha;
import tommy.mydesignpatterns.b_decorator.condiment_decorator.Soy;
import tommy.mydesignpatterns.b_decorator.condiment_decorator.Whip;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 测试类
 */

public class StarbuzzCoffee {

    public static final String TAG = "StarbuzzCoffee";

    /**
     * 点 浓咖啡
     */
    public static void orderEspresso() {
        //不加调料
        Beverage beverage = new Espresso();
        Log.i(TAG,beverage.getDescription() + "$" + beverage.cost());
    }

    /**
     * 点 综合咖啡
     */
    public static void orderHouseBlend() {
        //加奶泡
        Beverage beverage = new Whip(new HouseBlend());//动态添加装饰 类似于 IO 操作的 Buffer 流
        Log.i(TAG,beverage.getDescription() + "$" + beverage.cost());

    }

    /**
     * 点 脱因咖啡
     */
    public static void orderDecaf() {
        //加多种调料
        Beverage beverage = new Decaf();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        Log.i(TAG,beverage.getDescription() + "$" + beverage.cost());
    }

    /**
     * 点 深培咖啡
     */
    public static void orderDarkRoast() {
        //双份奶泡
        Beverage beverage = new DarkRoast();
        beverage = new Soy(beverage);
        beverage = new Soy(beverage);
        Log.i(TAG,beverage.getDescription() + "$" + beverage.cost());
    }

}
