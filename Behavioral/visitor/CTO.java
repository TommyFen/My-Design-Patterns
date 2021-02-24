/**
 * 访问者：CTO，通过访问工程师的代码量和项目经理的项目数量来评估当年业绩。
 */
public class CTO implements Leader{

    @Override
    public void appraise(Engineer engineer){
        System.out.println("我是CTO，考察工程师"+ engineer.name +
                "的代码量是" + engineer.getCodeNumber());
    }

    @Override
    public void appraise(Pm pm){
        System.out.println("我是CTO，考察项目经理"+ pm.name +
                "的完成项目数是" + pm.getProjectCount());
    }
}