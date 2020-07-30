object Buddhi extends 
{

    class Rational(n:Int,d:Int)
    {
        require(d>0,"d must be greater than 0")
        def numer=n/gcd(math.abs(n),d)
        def denom=d/gcd(math.abs(n),d)
        def this(n:Int)=this(n,1)

        private def gcd(a:Int,b:Int):Int=if(b==0)a else gcd(b,a%b)

        def +(r:Rational)=new Rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom)

        def -(r:Rational)=this+r.neg

        override def toString=numer+"/"+denom

        def neg=new Rational(-this.numer,this.denom)
    }

    class Account(id:String,n:Int,b:Double)
    {
        val nic:String=id
        val acnumber:Int=n
        var balance:Double=b

        override def toString = "["+nic+":"+acnumber +":"+ balance+"]"

        def withdraw(a:Double) = this.balance=this.balance-a
        def deposit(a:Double) = this.balance=this.balance+a
        def transfer(a:Account,b:Double) 
        {
            this.withdraw(b)
            a.deposit(b)
        } 
    }

    val overdraft=(b:List[Account])=>b.filter(x=>x.balance<0)
    val balance = (b:List[Account])=>b.reduce((x1, x2) => new Account("", 0, x1.balance+x2.balance)).balance
    val interest=(b:List[Account]) => b.map(x => new Account(x.nic, x.acnumber, if(x.balance<0) x.balance*1.1 else x.balance*1.05))

    //debug

    def main(args: Array[String]):Unit={
        val res1 = new Rational(8,20)
        val n_res1 = res1.neg

        //output for q1
        println(n_res1)
        println("\n")

        val x = new Rational(3,4)
        val y = new Rational(5,8)
        val z = new Rational(2,7)
        val res2 = x-y-z

        //output for q2
        println(res2)
        println("\n")

        val acc1 = new Account("982730740v",0001,1000)
        val acc2 = new Account("982730741v",0002,1500)
        acc1.transfer(acc2, 350)

        //output for q3
        println(acc1)
        println("\n")
        println(acc2)
        println("\n")

        val acc3 = new Account("982730742v",0003,-1000)
        val acc4 = new Account("982730743v",0004,-1500)

        var bank:List[Account] = List()

        //create bank
        bank = acc1 :: bank
        bank = acc2 :: bank
        bank = acc3 :: bank
        bank = acc4 :: bank

        //display bank accounts
        println(bank)
        println("\n")

        //output for q4-1
        //display negative balanced accounts
        var over_d = overdraft(bank)
        println(over_d)
        println("\n")

        //output for q4-2
        var bal = balance(bank)
        println(bal)
        println("\n")

        //output for q4-3
        var f_balance = interest(bank)
        println(f_balance)
    }

}