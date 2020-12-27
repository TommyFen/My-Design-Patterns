
/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 装饰者：调料-奶泡
 */

public class Whip extends CondimentDecorator {
    private  Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (null != beverage) {
            return beverage.cost() + .10;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
