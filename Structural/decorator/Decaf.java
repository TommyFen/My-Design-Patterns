package tommy.mydesignpatterns.b_decorator;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 脱因咖啡
 */

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
