package v2_parameterized_spec;

public interface Specification<T> {
    boolean isSatisfiedBy(T o);
}
