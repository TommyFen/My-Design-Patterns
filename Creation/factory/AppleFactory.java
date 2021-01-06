/**
 * 工厂模式，符合单一职责原则，一个类型对应的一个工厂，增加了类创建的的灵活性
 */
class AppleFactory{
    public Fruit create(){
        return new Apple();
    }
}