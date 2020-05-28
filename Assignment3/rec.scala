object rec extends App{
	def GCD(a:Int,b:Int):Int=b match{
	case 0 => a
	case b if b>a => GCD(b,a)
	case _ => GCD(b,a%b)
	}

	def prime(p:Int,n:Int=2):Boolean= n match {
	case x if(x==p) => true
	case x if GCD(p,x)>1 => false
	case x => prime(p,x+1)
	}
	
	def primeSeq(n:Int):Any={
		if (n>2) primeSeq(n-1)
		if(prime(n)==true){
		if(n>=2) println(n)
		}
	}
	
	def add(n:Int):Int={
		if (n>1) return(n+add(n-1))
		return(1)
	}
	
	def isEven(n:Int):Boolean= n match{
	case 0 => true
	case _ => isOdd(n-1)
	}
	
	def isOdd(n:Int):Boolean = !(isEven(n))
	
	def addEven(n:Int):Int={
		if(n<2) return(0)
		if(n%2==0) {
		return(addEven(n-2)+n-2)
		}
		else{
		addEven(n+1)
		}
	}
	
	def fibonacci(n:Int):Int= n match{
	case 0 => 0
	case x if x==1 => 1
	case _ => fibonacci(n-1)+fibonacci(n-2)
	}
	
	def fibonacciSeq(n:Int):Unit= {
	if (n > 0) fibonacciSeq(n-1)
	println(fibonacci(n))
	}
	

}