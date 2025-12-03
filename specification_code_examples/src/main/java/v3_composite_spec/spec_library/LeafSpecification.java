package v3_composite_spec.spec_library;

import java.util.function.Predicate;

public class LeafSpecification<T> implements Specification<T> {
    private Predicate<T> predicate;

    public LeafSpecification(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean isSatisfiedBy(T o) { 
        return predicate.test(o);
    }
}
