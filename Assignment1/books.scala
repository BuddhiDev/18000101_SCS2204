object books extends App{

	def cashier(c:Double):Double={
	var bprice= 60.0/100.0*24.95;
	if(c-50>0){
		var cost=bprice*c+3+(c-50*0.75);
		return cost;
	}
	else{
		var cost=bprice*c+3;
		return cost;
	}
	}
	println(cashier(60));

}