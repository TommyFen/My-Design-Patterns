class App {
    public static void main(String[] args) {
        IFactory factory = new AppleFactory();
        Fruit apple = factory.create();
        apple.taste();

        IFactory factory2 = new PearFactory();
        Fruit pear = factory2.create();
        pear.taste();

    }
}