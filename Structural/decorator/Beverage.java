
/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/3
 * @desc: 所有饮料的 抽象类
 */

 public abstract class Beverage {

    String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
