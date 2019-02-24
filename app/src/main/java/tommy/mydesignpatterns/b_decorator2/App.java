package tommy.mydesignpatterns.b_decorator2;

/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/9
 * @desc: 巨魔的故事
 */

public class App {
    public static void main(String[] args) {
        System.out.println("A simple looking troll approaches.");
        Troll troll = new SimpleTroll();
        troll.attack();
        System.out.println("Simple troll power " + troll.getAttackPower());
        troll.fleeBattle();

        System.out.println("A clubbedTroll");
        troll = new ClubbedTroll(troll);
        troll.attack();
        System.out.println("Simple troll power " + troll.getAttackPower());
        troll.fleeBattle();

    }
}
