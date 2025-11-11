package v1_hard_coded_spec;

import java.util.function.Predicate;

public class HardCodedSpecification<T> implements Specification<T> {
    Predicate<T> predicate;

    public HardCodedSpecification(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return predicate.test(o);
    }
}