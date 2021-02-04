/**
 * 管理者
 */
import java.util.List;
import java.util.ArrayList;

public class Manager extends Component {

    //管理的下属
    private List<Component> componentList = new ArrayList<>();

    public Manager(String position, String job){
        super(position, job);
    }

    @Override
    public void addComponent(Component component){
        componentList.add(component);
    }

    @Override
    public void check(){
        work();
        for (Component component:componentList) {
            component.check();
        }

    }

}