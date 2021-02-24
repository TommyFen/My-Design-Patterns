/**
 * 工程师
 */
public class Engineer extends Staff{

    public Engineer(String name, int kpi){
        super(name, kpi);
    }

    @Override
    public void accept(Leader leader){
        leader.appraise(this);
    }

    public int getCodeNumber(){
        return 10000;
    }

}