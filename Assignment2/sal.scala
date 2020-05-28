object sal extends App{
	def wage(hours:Int):Int=hours*150
	def ot(hours:Int):Int=hours*75
	def income(h1:Int,h2:Int):Int=wage(h1)+ot(h2)
	def tax(inc:Int):Double=inc*.1
	def takeHome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1,h2))
	
	println("Insert wage hours:");
	val w_hours = scala.io.StdIn.readInt()
	println("Insert ot hours:");
	val ot_hours = scala.io.StdIn.readInt()
	println(takeHome(w_hours,ot_hours));
}