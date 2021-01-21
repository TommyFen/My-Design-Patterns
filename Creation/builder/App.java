public class App{

    public static void main(String[] args) {
        MilkTea milkTea = new MilkTea.Builder()
                .type("原味")
                .size("small")
                .pearl(true)
                .ice(true)
                .build();

        System.out.println("milkTea's type is " + milkTea.getType()
        + ", size is " + milkTea.getSize() + ", need add pearl? " + milkTea.isPearl()
        + ", need add ice? " + milkTea.isIce());
    }
}