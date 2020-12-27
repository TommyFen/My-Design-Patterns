
/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 装饰者：调料-牛奶
 */

public class Milk extends CondimentDecorator {
    private  Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage != null) {
            return beverage.cost() + 0.1;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
