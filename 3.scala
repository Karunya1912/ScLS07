object Que3{

    def  isPrime(n:Int):Boolean={
        if (n<=1) false
        else if (n==2) true
        else {
            var isPrime=true
            for(i <- 2 to math.sqrt(n).toInt if isPrime)
            {
                if(n % i == 0)
                {
                    isPrime=false
                }
                
            }
            isPrime
        }
    }

    def filterPrime(numbers:List[Int]):List[Int] = {
        numbers.filter(n => isPrime(n))
    }

    def main(args:Array[String]):Unit={
        val input=List(1,2,3,4,5,6,7,8,9,10)
        val output=filterPrime(input)
        println(output)
    }
    
}