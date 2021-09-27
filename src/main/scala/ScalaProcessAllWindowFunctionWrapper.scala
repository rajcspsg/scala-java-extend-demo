import java.lang

final class ScalaProcessAllWindowFunctionWrapper[IN, OUT, W <: Window] extends JProcessAllWindowFunction[IN, OUT, W] {
  def process(context: JProcessAllWindowFunction[IN, OUT, W]#Context, elements: lang.Iterable[IN], out: Collector[OUT]): Unit = ???
}