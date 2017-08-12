package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val x = 1 + 2;                                  //> x  : Int = 3
  
  
  
  
  def square (x:Int) = x * x;                     //> square: (x: Int)Int
  
  println(square(x));                             //> 9
  
  
  
  
  
  //Number 1
  
def fib(n:Int): Int = {
	
	print(n + ",");
	if(n==0){
		1
	}else if(n==1){
		1
	}else{
		fib(n-1) + fib(n-2)
		
	}

}                                                 //> fib: (n: Int)Int

fib(6)                                            //> 6,5,4,3,2,1,0,1,2,1,0,3,2,1,0,1,4,3,2,1,0,1,2,1,0,res0: Int = 13
  
  
  //Number 2
val str = "facebook";                             //> str  : String = facebook

val char1 = "f";                                  //> char1  : String = f
val char2 = "b";                                  //> char2  : String = b

if(str.startsWith("f")){
println("Fizz");

}else if(str.endsWith("b")){
println("Buzz");

}else if (str.startsWith("f") && str.endsWith("b")){
println("FizzBuzz")

}                                                 //> Fizz

//Number 3

 def factorial(n:Int): Int = {
	
	if(n+1==0){
		n
	}else if(n+1==1){
		1
	}else{
		println(n)
		n * factorial(n-1)
		
	}

}                                                 //> factorial: (n: Int)Int
                                                  
 factorial(5)                                     //> 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| res1: Int = 120



	
//Number 4

val int = 3;                                      //> int  : Int = 3
val equation = ""                                 //> equation  : String = ""




}