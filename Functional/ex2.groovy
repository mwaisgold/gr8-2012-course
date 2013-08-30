//Finding even numbers example. First imperative then functional style
def numbers = [1,2,3,4,5,6]

//Imperative way to find FIRST!! even number
def evenNumber

for (number in numbers){

	if (number % 2 == 0){
		evenNumber = number
		break
	}
}

println evenNumber

//Functional
def isEven = { it % 2 == 0 }
println numbers.find(isEven) 


//Functional all even numbers
println numbers.findAll(isEven)

//BONUS: Imperative print separated commas values
def str = ""

for (int i = 0; i < numbers.size() -1; i++){
	str += numbers[i] + ","
}

str += numbers[numbers.size()-1]

println str
//Functional using GDK in top of JDK
println numbers.join(",")

