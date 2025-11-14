package v3_composite_spec.spec_library;

public class AndSpecification<T> extends CompositeSpecification<T> {
    Specification<T> left;
    Specification<T> right;

    public AndSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return left.isSatisfiedBy(o) && right.isSatisfiedBy(o);
    }
}
