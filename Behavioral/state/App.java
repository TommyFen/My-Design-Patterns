/**
 * 状态模式：
 * 以账户的会员、普通用户为例，来处理播放vip音乐的操作情形
 * (实际情况其实可以通过装饰模式和状态模式来解决会员状态变化的问题)
 */
public class App{

    public static void main(String[] args){
        //默认状态下为普通会员
        User user = new NormalUser();
        user.playVipMusic();
        //充值会员操作
        user = new VipUser();
        user.playVipMusic();
    }
}