//Example of calculating sum of numbers

def numbers = [1,2,3,4,5,6]

//Imperative way
def acum = 0

for (number in numbers){
	acum += number
}

println acum

//Functional with inject

//println numbers.inject(0) { curr, nextVal -> curr + nextVal }
println numbers.sum()

//To see what is happening adding some printlines
println numbers.inject(0) { curr, nextVal -> 
	println "curr $curr nextVal $nextVal"
	curr + nextVal 
}