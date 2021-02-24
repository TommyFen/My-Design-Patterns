/**
 * 访问者：CEO，通过访问工程师和项目经理kpi来评估当年业绩。
 */
public class CEO implements Leader{

    @Override
    public void appraise(Engineer engineer){
        System.out.println("我是CEO，考察工程师的"+ engineer.name +
                "的kpi是" + engineer.kpi);
    }

    @Override
    public void appraise(Pm pm){
        System.out.println("我是CEO，考察项目经理"+ pm.name +
                "的kpi是" + pm.kpi);
    }
}