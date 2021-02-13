/**
 * @author : Guojin
 * @e-mail : tommyfenv@163.com
 * @date : 2017/11/9
 * @desc: 巨魔的故事
 *
 * 装饰着模式分为两种，一种称为透明装饰，用于增强功能，能多次装饰；另外一种称为半透明的模式，用于增加功能，不建议多次装饰。
 * 巨魔的故事是一种透明模式。
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
