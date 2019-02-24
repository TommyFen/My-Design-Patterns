package tommy.mydesignpatterns.b_decorator.condiment_decorator;

import tommy.mydesignpatterns.b_decorator.Beverage;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 调料
 */

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();
}
