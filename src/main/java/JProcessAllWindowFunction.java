public abstract class JProcessAllWindowFunction<IN, OUT, W extends Window> {

    private static final long serialVersionUID = 1L;


    public final void process(Context context, Iterable<IN> elements, Collector<OUT> out){}

    public void clear(Context context) {}

    public abstract class Context {
        public abstract W window();
        public abstract <X> void output( X value);
    }
}