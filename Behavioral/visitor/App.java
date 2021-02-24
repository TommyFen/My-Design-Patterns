/**
 * 访问者模式：这里例举的双派情况下（Java 只能单派）
 * 举例场景，源自：https://blog.csdn.net/qq_25806863/article/details/69372613
 * CEO访问工程师和经理，要获取他们的KPI作为考核依据
 * CTO访问工程师要获取代码量，访问经理要获取项目个数作为开合依据
 * 角色：
 * 访问者（CEO 和 CTO）
 * 被访问者（报表，包含工程师 和 项目经理两个元素）
 */
public class App{

    public static void main(String[] args){
        Report report = new Report();
        //CEO 评估报表
        report.showReport(new CEO());
        System.out.println("................");
        // CTP 评估报表
        report.showReport(new CTO());
    }
}