package tommy.mydesignpatterns.b_decorator.condiment_decorator;

import tommy.mydesignpatterns.b_decorator.Beverage;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 装饰者：调料-摩卡
 */

public class Mocha extends CondimentDecorator {

    private  Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {

        if (beverage != null) {
            return beverage.cost() + 0.20;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
