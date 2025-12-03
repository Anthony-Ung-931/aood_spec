package v0_naive_approach;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;


/**
 * This is the naive approach to filtering baseball seats
 *      using the techniques you would have learned in
 *      Object-Oriented Programming and Data Abstraction (OOPDA)
 */
public class Main {
    public static void main(String[] args) {
        Set<BaseballSeat> baseballSeats = new HashSet<>();

        baseballSeats.add(new BaseballSeat(74.99, 131, 10, 5));
        baseballSeats.add(new BaseballSeat(134.99, 1, 8, 12));
        baseballSeats.add(new BaseballSeat(108.99, 4, 12, 14));
        baseballSeats.add(new BaseballSeat(84.99, 225, 6, 7));
        baseballSeats.add(new BaseballSeat(68.99, 424, 3, 8));

        Predicate<BaseballSeat> want_front_row = 
            (seat -> seat.getSection() <= 199);

        System.out.println(
            "One customer wants a front row seat.\n" + 
            "These seats satify his criteria."
        );

        baseballSeats.stream().forEach(seat -> {
            if(want_front_row.test(seat)) {
                System.out.println(seat);
            }
        });

        System.out.println("");


        Predicate<BaseballSeat> want_cheap_seat = 
            (seat -> seat.getCost() <= 75.00);
        
        System.out.println("A different customer wants a cheap seat.");

        baseballSeats.stream().forEach(seat -> {
            if(want_cheap_seat.test(seat)) {
                System.out.println(seat);
            }
        });

        System.out.println("");
    }
}