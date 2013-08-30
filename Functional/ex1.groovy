//Doubling numbers example

def numbers = [ 1,2,3,4,5,6 ] //List to double

//Imperative version. Want to tell how to de everything, low level
def doubledNumbers = new ArrayList()

for (number in numbers){
	doubledNumbers.add(number * 2)
}

println doubledNumbers

//Functional simple higher level functions
def doubleIt = { it * 2 }
println numbers.collect(doubleIt)

//Examples with passing parameter, using "it" and function to variable
