/**
 * 工程师
 */
public class Pm extends Staff{

    public Pm(String name, int kpi){
        super(name, kpi);
    }

    @Override
    public void accept(Leader leader){
        leader.appraise(this);
    }

    public int getProjectCount(){
        return 10;
    }

}