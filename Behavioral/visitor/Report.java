import java.util.List;
import java.util.ArrayList;
/**
 * 被访问者，基本元素有：工程师和项目经理
 */
public class Report{

    List<Staff> list = new ArrayList<>();

    public Report(){
        list.add(new Engineer("赵一", 100));
        list.add(new Engineer("李二", 90));
        list.add(new Pm("张三", 110));
        list.add(new Pm("李四", 100));
    }

    /**
     * 展示播表
     * @param leader
     */
    public void showReport(Leader leader){
        for (Staff staff:list) {
            staff.accept(leader);
        }
    }
}