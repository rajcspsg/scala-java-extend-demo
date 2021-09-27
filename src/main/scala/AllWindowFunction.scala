trait AllWindowFunction[IN, OUT, W <: Window] extends Function with Serializable {

  def apply(window: W, input: Iterable[IN], out: Collector[OUT]): Unit
}