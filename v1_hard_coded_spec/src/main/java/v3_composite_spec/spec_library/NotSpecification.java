package v3_composite_spec.spec_library;

public class NotSpecification<T> extends CompositeSpecification<T> {
    Specification<T> wrappedSpec;

    public NotSpecification(Specification<T> wrappedSpec) {
        this.wrappedSpec = wrappedSpec;
    }

    @Override
    public boolean isSatisfiedBy(T o) {
        return !(wrappedSpec.isSatisfiedBy(o));
    }
}
