package v3_composite_spec;

import java.util.HashSet;
import java.util.Set;

import v3_composite_spec.Baseball.BaseballSeat;

public class Baseball_Config {
    public static Set<BaseballSeat> getAllSeats() {
        Set<BaseballSeat> baseballSeats = new HashSet<>();

        baseballSeats.add(new BaseballSeat(74.99, 131, 10, 5, false));
        baseballSeats.add(new BaseballSeat(134.99, 1, 8, 12, false));
        baseballSeats.add(new BaseballSeat(108.99, 4, 12, 31, false));
        baseballSeats.add(new BaseballSeat(84.99, 225, 6, 7, false));
        baseballSeats.add(new BaseballSeat(68.99, 424, 3, 8, false));

        baseballSeats.add(new BaseballSeat(47.99, 424, 1, 1, true));
        baseballSeats.add(new BaseballSeat(76.99, 312, 1, 100, true));
        baseballSeats.add(new BaseballSeat(102.99, 231, 12, 5, false));

        baseballSeats.add(new BaseballSeat(102.99, 231, 12, 5, false));
        baseballSeats.add(new BaseballSeat(134.99, 2, 1, 1, true));

        baseballSeats.add(new BaseballSeat(124.99, 8, 2, 100, true));

        baseballSeats.add(new BaseballSeat(89.99, 104, 1, 1, true));

        return baseballSeats;
    }
}
