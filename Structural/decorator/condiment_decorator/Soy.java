
/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 装饰者：调料-豆汁
 */

public class Soy extends CondimentDecorator {

    private  Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (null != beverage) {
            return beverage.cost() + 0.15;
        }
        return 0;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
}
