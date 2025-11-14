package v3_composite_spec;

public class CompositeSpecification<T> implements Specification<T>{
    Specification<T> wrapped_spec;

    public CompositeSpecification(Specification<T> spec) {
        this.wrapped_spec = spec;
    }
    
    @Override
    public boolean isSatisfiedBy(T o) {
        // Implementation will go here
        return wrapped_spec.isSatisfiedBy(o);
    }
}
