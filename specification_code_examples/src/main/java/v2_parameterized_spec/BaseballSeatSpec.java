package v2_parameterized_spec;


/**
 * An implementation of the Specification<BaseballSeat> interface
 *      that allows for parameterized specificatios to be instantiated.
 * 
 * Parameter VALUES are hot-swappable but parameter TYPES are not.
 */
public class BaseballSeatSpec implements Specification<BaseballSeat> {
    private final double price_min;
    private final double price_max;

    private final int section_min;
    private final int section_max;

    public static class BaseballSeatSpecBuilder {
        private double price_min = Double.MIN_VALUE;
        private double price_max = Double.MAX_VALUE;

        private int section_min = Integer.MIN_VALUE;
        private int section_max = Integer.MAX_VALUE;

        private BaseballSeatSpec spec;

        public BaseballSeatSpecBuilder() {
            // Nop - Returns the address to the caller
        }

        public BaseballSeatSpecBuilder setPriceMin(double price_min) {
            if(price_min < this.price_max) {
                this.price_min = price_min;
            }
            return this;
        }

        public BaseballSeatSpecBuilder setPriceMax(double price_max) {
            if(price_max > this.price_min) {
                this.price_max = price_max;
            }
            this.price_max = price_max;
            return this;
        }

        public BaseballSeatSpecBuilder setSectionMin(int section_min) {
            if(section_min < this.section_max) {
                this.section_min = section_min;
            }
            return this;
        }

        public BaseballSeatSpecBuilder setSectionMax(int section_max) {
            if(section_max > this.section_min) {
                this.section_max = section_max;
            }
            return this;
        }

        public BaseballSeatSpec build() {
            spec = new BaseballSeatSpec(this);
            return spec;
        }

    }

    private BaseballSeatSpec(BaseballSeatSpecBuilder builder) {
        this.price_min = builder.price_min;
        this.price_max = builder.price_max;
        this.section_min = builder.section_min;
        this.section_max = builder.section_max;
    }

    @Override
    public boolean isSatisfiedBy(BaseballSeat seat) {
        return seat.getCost() >= price_min && seat.getCost() <= price_max && 
               seat.getSection() >= section_min && seat.getSection() <= section_max;
    }
    
}
