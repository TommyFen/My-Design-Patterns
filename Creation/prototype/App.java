public class App {
    public static void main(String[] args) {

        MilkTea milkTeaYour = new MilkTea();
        milkTeaYour.type = "原味";
        milkTeaYour.ice = false;

        System.out.println("Your milkTea is " + milkTeaYour.type + ", ice is " +milkTeaYour.ice);

        //复制完全一样的一份实例
        MilkTea milkTeaMine = milkTeaYour.clone();
        System.out.println("My milkTea is " + milkTeaMine.type + ", ice is " +milkTeaMine.ice);

    }
}