package v3_composite_spec;

public interface Specification<T> {
    boolean isSatisfiedBy(T o);
}
