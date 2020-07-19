object cc extends App{
val lang="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
val e=(c:Char,key:Int, a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
val d=(c:Char,key:Int, a:String)=>a((a.indexOf(c.toUpper)-key+a.size)%a.size);
val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a.String)=>s.map(algo(_,key,a));
val ce=cipher(e,"stuvw",5,lang);
val cd=cipher(d,"ef",2,lang);
println(ce);
println(cd);
}