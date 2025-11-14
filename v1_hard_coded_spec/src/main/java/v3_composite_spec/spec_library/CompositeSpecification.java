package v3_composite_spec.spec_library;

public abstract class CompositeSpecification<T> implements Specification<T>{

    public CompositeSpecification() {
    }
    
    @Override
    public abstract boolean isSatisfiedBy(T o);
}
