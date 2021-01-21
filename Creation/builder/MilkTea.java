/**
 * 建造者模式：将一个复杂的构建与其表示分离，使得同样的创建过程可以创建的不同的表示。
 * 一个对象有多个组件，不同的组件的组合可以都可以表示这个对象，简而言之，可以根据需要将不同的组件组合
 * 然后构建一个需要的对象。
 */
public class MilkTea{
    private final String type;

    private final String size;

    private final boolean pearl;

    private final boolean ice;

    private MilkTea(Builder builder) {
        this.type = builder.type;
        this.size = builder.size;
        this.pearl = builder.pearl;
        this.ice = builder.ice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    public boolean isPearl() {
        return pearl;
    }

    public boolean isIce() {
        return ice;
    }

    public static class Builder{
        /**
         * 奶茶的种类
         */
        private String type="原味";

        /**
         * 奶茶的大小：小杯、中杯、大杯
         */
        private String size = "middle";

        /**
         * 是否需要加珍珠
         */
        private boolean pearl = false;

        /**
         * 是否需要加冰
         */
        private boolean ice = false;

        /**
         * 创建者必须声明是哪种类型的奶茶
         * @param type
         */
        public Builder() {

        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder pearl(boolean pearl) {
            this.pearl = pearl;
            return this;
        }

        public Builder ice(boolean ice) {
            this.ice = ice;
            return this;
        }

        public MilkTea build() {
            return new MilkTea(this);
        }

    }

}