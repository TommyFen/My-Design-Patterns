class PearFactory implements IFactory{
    @Override
    public Fruit create(){
        return new Pear();
    }
}