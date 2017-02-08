package app;

public interface Action<T> {
    void execute(T variable);
}
