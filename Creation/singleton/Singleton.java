/**
 * 单例模式：
 * 饿汉式： 直接初始化，无相关性能问题
 * 懒汉式：因为线程安全问题从而衍生出单例锁安全、双检锁安全、内部类安全等懒加载的方式
 */
public class Singleton {
    /**
     * 饿汉式的实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 懒汉式的实例
     */
    private static volatile Singleton instance2 = null;

    private Singleton(){}

    /**
     * 饿汉式
     * @return
     */
    public static Singleton getHungryInstance(){
        return instance;
    }

    /**
     * 线程不安全的懒汉式
     * @return
     */
    public static Singleton getInstance(){
        if (null == instance2) {
            return new Singleton();
        }
        return  instance2;
    }

    /**
     * 线程安全，但是由于每次获取实例都需要检查锁，效率不够高
     *
     * @return
     */
    public static Singleton getInstance2() {
        synchronized (Singleton.class){
            if (null == instance2) {
                return new Singleton();
            }
            return instance2;
        }
    }

    /**
     * 优化2中的效率，线程双检锁安全，但仍然不保险，JVM 底层为了优化程序运行效率，可能会对我们的代码进行
     * 指令重新排序，在一些特殊的情况下会导致这类单例模式线程不安全，一般为了防止这种情况，会给实例添加
     * volatile 关键字，如： private static Singleton volatile intance = null;
     *
     * @return
     */
    public static Singleton getInstance3() {
        if (null == instance2) {
            synchronized (Singleton.class) {
                if (null == instance2) {
                    instance2 = new Singleton();
                }
            }
        }
        return instance2;
    }

    /**
     * 内部类实现懒加载
     * @return
     */
    public static Singleton getInstance4() {
        return SingletonHolder.intance;
    }

    /**
     * 内部类实现懒加载
     * Singleton 在加载的时候，不会直接加载内部类，只有使用到了才回去加载。
     * 同时类的实例创建在JVW中是线程安全的
     */
    private static class SingletonHolder{
        public static Singleton intance = new Singleton();
    }
}