
abstract class ScalaProcessAllWindowFunction[IN, OUT, W <: Window] {
  def process(context: Context, elements: Iterable[IN], out: Collector[OUT]): Unit

  abstract class Context {

    def window: W


    def output[X]( value: X): Unit
  }
}