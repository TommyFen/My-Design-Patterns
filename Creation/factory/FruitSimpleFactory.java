/**
 * 简单工厂模式是工厂模式的一种的特例。它有明显的缺陷，就是不符合开放关闭原则以及单一职责原则。
 * 但胜在简单，快速封装。
 */
class FruitSimpleFactory{
    public static Fruit createFruit(String name){
        switch (name) {
            case "Apple":
                return new Apple();

            case "Pear":
                return new Pear();
        }
        return null;
    }
}