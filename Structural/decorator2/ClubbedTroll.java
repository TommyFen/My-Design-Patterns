package tommy.mydesignpatterns.b_decorator2;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/9
 * @desc:
 */

public class ClubbedTroll implements Troll {
    private Troll troll;

    public ClubbedTroll(Troll troll) {
        this.troll = troll;
    }

    @Override
    public void attack() {
        troll.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {

        return 10 + troll.getAttackPower();
    }

    @Override
    public void fleeBattle() {
        troll.fleeBattle();
    }
}
