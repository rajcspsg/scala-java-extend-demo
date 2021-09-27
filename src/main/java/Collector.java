public interface Collector<T> {
    void collect(T record);

    void close();
}