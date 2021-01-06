class App {
    public static void main(String[] args) {

//        simpleCreate();
        normalCreate();
    }

    static void simleCreate(){
        //简单工厂模式
        FruitSimpleFactory  factory =  new FruitSimpleFactory();
        Fruit apple = factory.createFruit("Apple");
        apple.taste();
        Fruit pear = factory.createFruit("Pear");
        pear.taste();
    }

    static void normalCreate(){
        //正常下的工厂模式
        AppleFactory appleFactoroy = new AppleFactory();
        Fruit apple = appleFactoroy.create();
        apple.taste();
    }
}