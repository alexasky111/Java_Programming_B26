package day63_functional_interface;

@FunctionalInterface
public interface DynamicInterface<T> {

    void test(T t); //T is generic type, t parameter name


}
