object MyApp extends App{

import math.{ sqrt, pow }

val p1=Point(2,3)
val p2=Point(4,5)
val p3=p1+p2
//q1
println(p3)
//q2
println(p1.move(6,5))
//q3
println(p1.distance(p2))
//q4
println(p1.invert())

case class Point(x: Double, y: Double) {

  def distance(other: Point): Double =
    sqrt(pow(x - other.x, 2) + pow(y - other.y, 2))

  def move(dx: Int, dy:Int) = Point(this.x+dx, this.y+dy)

  def +(that: Point) = Point(this.x + that.x, this.y + that.y)

  def invert()= Point(this.y, this.x)
}

}
