package v2_parameterized_spec;

public class BaseballSeatSpec implements Specification<BaseballSeat> {
    private final double price_min;
    private final double price_max;

    private final int section_min;
    private final int section_max;

    public BaseballSeatSpec
        (Double price_min, Double price_max, 
        Integer section_min, Integer section_max) {
        
            this.price_min = ((price_min == null) || (price_min < 0)) 
                ? 0.0 : price_min;
        this.price_max = ((price_max == null) || (price_max < 0) 
            || ((price_min != null) && (price_max <= price_min))) 
                ? Double.MAX_VALUE : price_max;

        this.section_min = ((section_min == null) || (section_min < 0)) 
                ? 0 : section_min;
        this.section_max = ((section_max == null) || (section_max < 0) 
            || ((section_min != null) && (section_max <= section_min))) 
                ? Integer.MAX_VALUE : section_max;
    }

    @Override
    public boolean isSatisfiedBy(BaseballSeat seat) {
        return seat.getCost() >= price_min && seat.getCost() <= price_max && 
               seat.getSection() >= section_min && seat.getSection() <= section_max;
    }
    
}
