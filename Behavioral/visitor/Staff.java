/**
 * 被访问者的元素：员工，相关的基类
 */
public abstract class Staff{
    public String name;
    public int kpi;

    public Staff(String name, int kpi){
        this.name = name;
        this.kpi = kpi;
    }

    /**
     * 双派方式，定义一个接收访问者的方法
     * @param manager 访问者
     */
    public abstract void accept(Leader leader);
}