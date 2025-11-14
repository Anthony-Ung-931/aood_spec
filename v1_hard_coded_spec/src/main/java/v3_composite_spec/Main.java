package v3_composite_spec;

import java.util.Set;

import v3_composite_spec.Baseball.BaseballSeat;
import v3_composite_spec.spec_library.LeafSpecification;
import v3_composite_spec.spec_library.Specification;


public class Main {
    
    public static void main(String[] args) {
        Set<BaseballSeat> baseballSeats = Baseball_Config.getAllSeats();


        System.out.println("One customer wants a cheap seat");
        System.out.println("This time, we instantiate a LeafSpecification.");

        Specification<BaseballSeat> cheap_seat_spec = 
            new LeafSpecification<BaseballSeat>(
                seat -> seat.getCost() <= 75.00
            );

        baseballSeats.stream().forEach(seat -> {
            if(cheap_seat_spec.isSatisfiedBy(seat)) {   
                System.out.println(seat);
            }  
        });

        System.out.println("\n\n");


        System.out.println("A second customer wants a close seat");
        System.out.println("This time, we instantiate a LeafSpecification.");

        Specification<BaseballSeat> close_seat_spec = 
            new LeafSpecification<BaseballSeat>(
                seat -> seat.getSection() <= 199
            );

        baseballSeats.stream().forEach(seat -> {
            if(close_seat_spec.isSatisfiedBy(seat)) {   
                System.out.println(seat);
            }  
        });

        System.out.println("\n\n");


        System.out.println("A third customer wants an accessible seat");
        System.out.println("This time, we instantiate a LeafSpecification.");

        Specification<BaseballSeat> accessible_seat_spec = 
            new LeafSpecification<>(
                seat -> seat.get_isAccessible() == true
            );

        baseballSeats.stream().forEach(seat -> {
            if(accessible_seat_spec.isSatisfiedBy(seat)) {   
                System.out.println(seat);
            }
        });

    }
}
