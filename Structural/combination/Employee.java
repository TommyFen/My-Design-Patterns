/**
 * 员工
 */
public class Employee extends Component{

    public Employee(String poistion, String job) {
        super(poistion, job);
    }

    @Override
    public void addComponent(Component component){
        System.out.println("职员没有管理权限");
    }

    @Override
    public void check(){
        work();
    }
}