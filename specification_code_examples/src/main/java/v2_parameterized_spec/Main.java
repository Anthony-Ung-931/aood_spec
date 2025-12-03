package v2_parameterized_spec;

import java.util.HashSet;
import java.util.Set;


/**
 * V2 - Parameterized Specification
 *      Demonstrates the usage of a parameterized specification
 */
public class Main {
    public static void main(String[] args) {
        Set<BaseballSeat> baseballSeats = new HashSet<>();

        baseballSeats.add(new BaseballSeat(74.99, 131, 10, 5));
        baseballSeats.add(new BaseballSeat(134.99, 1, 8, 12));
        baseballSeats.add(new BaseballSeat(108.99, 4, 12, 14));
        baseballSeats.add(new BaseballSeat(84.99, 225, 6, 7));
        baseballSeats.add(new BaseballSeat(68.99, 424, 3, 8));



        System.out.println("One customer wants a front row seat.");

        BaseballSeatSpec want_front_row = new BaseballSeatSpec(
            null, null, null, 199
        );

        baseballSeats.stream().forEach(seat -> {
            if(want_front_row.isSatisfiedBy(seat)) {
                System.out.println(seat);
            }
        });

        System.out.println("");


        
        System.out.println("A different customer wants a cheap seat.");
        
        BaseballSeatSpec want_cheap_seat = new BaseballSeatSpec(
            null, 75.00, null, null
        );

        baseballSeats.stream().forEach(seat -> {
            if(want_cheap_seat.isSatisfiedBy(seat)) {
                System.out.println(seat);
            }
        });

        System.out.println("");
    }
}