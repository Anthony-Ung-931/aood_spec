package v3_composite_spec.spec_library;

public interface Specification<T> {
    boolean isSatisfiedBy(T o);
}
