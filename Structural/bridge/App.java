/**
 * 桥接模式：将抽象的部分与它的实现分离，使它们可以独立的变化。它是一种对象结构型模式，又被成为柄体模式或者接口模式。
 * 桥接模式其实最重要的思想是：少继承，多聚合。意思多用接口，少用继承。因为继承通常会使得代码变得沉重。
 * 桥接模式主要应用于平级的接口当中，使它们可以随意组合，灵活变化。
 */
public class App{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(new Blue());
        rectangle.draw();

        Round round = new Round();
        round.setColor(new Red());
        round.draw();

        Triangle triangle = new Triangle();
        triangle.setColor(new Yellow());
        triangle.draw();
    }
}