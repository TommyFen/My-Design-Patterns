/**
 * 抽象工厂模式，进一步对工厂模式进行优化，更加契合最小知道原则、里式替换原则，以及依赖倒置原则。
 */
class AppleFactory implements IFactory{

    @Override
    public Fruit create(){
        return new Apple();
    }
}