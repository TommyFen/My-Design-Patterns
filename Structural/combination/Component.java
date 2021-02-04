/**
 * 公司的成员组成部分抽象类
 */
public abstract class Component{
    private String position;

    private String job;

    public Component(String position, String job){
        this.position = position;
        this.job = job;
    }

    public void work(){
        System.out.println("我是" + position + "，我正在" + job);
    }

    /**
     * 下属
     * @param component
     */
    abstract void addComponent(Component component);


    /**
     * 检查工作
     */
    abstract void check();

}