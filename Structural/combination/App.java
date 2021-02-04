/**
 * 组合设计模式：用于整体和部分的结构。由称为部分整体模式。
 * 适用场景：当整体与部分有相似的结构，在操作时可以被一致对待时，就可以使用组合模式。
 * 组合模式分为安全组合模式（符合接口隔离原则）与透明组合模式（写法更方便）。
 */
public class App{

    public static void main(String[] args){
        Component boss = new Manager("老板", "唱怒放的生命");
        Component CTO = new Manager("技术主管", "划水");
        Component CFO = new Manager("财务主管", "看剧");

        Component webProgrammer = new Employee("前端程序员", "写HTML");
        Component clientProgrammer = new Employee("客户端程序员", "写设计模式");
        Component bgProgrammer = new Employee("后端程序序员", "CRUD");

        Component accountant = new Employee("会计", "背九九乘法表");
        Component clerk = new Employee("文员", "给老板递麦克风");

        boss.addComponent(CTO);
        boss.addComponent(CFO);

        CTO.addComponent(webProgrammer);
        CTO.addComponent(clientProgrammer);
        CTO.addComponent(bgProgrammer);

        CFO.addComponent(accountant);
        CFO.addComponent(clerk);

        boss.check();
    }

}