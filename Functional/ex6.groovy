//Mixing impurity into functional style is not a good idea
def numbers = [2,4,6]
def funcs = []

for (number in numbers) { //Bad idea, number is not a final variable IS MUTABLE
    funcs << { -> println number} //Number mutated in every run of the loop
}

funcs.each { it() }
/*
for (func in funcs) {
    func() 
}*/

//Fixing
funcs = numbers.collect { number -> { -> println number} } //Not MUTATING, each time is a different "number" variable
funcs.each { it() } //Each is dangerous it's a STATEMENT


