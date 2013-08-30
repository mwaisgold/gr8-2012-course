//Example Find total double of even numbers
def numbers = [1,2,3,4,5,6]

//Imperative
def evenOnly = []
for (number in numbers){
	if (number % 2 == 0) evenOnly << number
}

def doubleOfEvenOnly = []
for (number in evenOnly){
	doubleOfEvenOnly << number * 2
}

def totalOfDoubleEvenOnly = 0
for (number in doubleOfEvenOnly){
	totalOfDoubleEvenOnly += number
}

println totalOfDoubleEvenOnly

//functional style
def isEven = { it % 2 == 0}
def doubleIt = { it * 2 }

println numbers.findAll(isEven).collect(doubleIt).sum()