/**
 * 由于面向对象语言的引用类型进行赋值时，都是传地址，而非传值。基本数据类型才是传值。
 * 原型模式的定义：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
 * 个人理解为复制完全一样的对象实例，从引用数据类型基本由基本数据类型构成，本质上我理解为
 * 最终的对象实例复制就是基于对象最基本的数据类型复制（深拷贝）。
 * Java 中Ojbect.clone() 就是原型模式。
 * 同时 Java 中也存在语法糖的情况，让对象实现原型模式可以直接实现 Cloneable，但它仅仅能实现浅拷贝。
 *
 */
public class MilkTea{

    public String type;
    public boolean ice;

    public MilkTea clone() {
        MilkTea milkTea = new MilkTea();
        milkTea.type = this.type;
        milkTea.ice = this.ice;
        return  milkTea;
    }

}